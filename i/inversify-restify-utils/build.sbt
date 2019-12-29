organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-178cd6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-f56c5c",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-6c7504",
  "org.scalablytyped" %%% "inversify" % "5.0.1-29cf9b",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-9e177b",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-50c0f0",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        