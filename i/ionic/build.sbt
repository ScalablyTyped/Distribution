organization := "org.scalablytyped"
name := "ionic"
version := "5.4.1-391179"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-4a3558",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-7db9e7",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.7-c2dd54",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-8aca92",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-61341f",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.8-9a5070",
  "org.scalablytyped" %%% "log-update" % "3.3.0-83cbac",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-b40bed",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-9938ed",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "string-width" % "4.1.0-a38b3c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-def34d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-e9eacc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        