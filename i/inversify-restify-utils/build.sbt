organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-e87835"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-ab77d8",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20190322Z-ec0bae",
  "org.scalablytyped" %%% "inversify" % "5.0.1-2776b4",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-1a2b74",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-421f43",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        