organization := "org.scalablytyped"
name := "ionic"
version := "5.2.3-3fd11e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-909f6c",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-a73a86",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.2-10f545",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-08caa1",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-4c3f85",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.3-026f90",
  "org.scalablytyped" %%% "log-update" % "3.2.0-a27c4a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-5d5bf4",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-c5f4a8",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "string-width" % "4.1.0-b10cdb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-2bd0fe",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-553c49")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        