organization := "org.scalablytyped"
name := "ionic"
version := "5.2.7-617236"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-4a3558",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-d8867e",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.6-78a2a9",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.4-8aae7f",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.4-081384",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.7-bce69c",
  "org.scalablytyped" %%% "log-update" % "3.3.0-f42354",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-b40bed",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-9938ed",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "string-width" % "4.1.0-a38b3c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-bacd02",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-c38548")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        