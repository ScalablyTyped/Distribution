organization := "org.scalablytyped"
name := "ionic"
version := "5.2.3-de417b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-5c91a1",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-b270f9",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.2-420927",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-a3aadc",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-154992",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.3-c65e1c",
  "org.scalablytyped" %%% "log-update" % "3.2.0-d23ab9",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-a678da",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "string-width" % "4.1.0-945852",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-206560",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-bccf4d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        