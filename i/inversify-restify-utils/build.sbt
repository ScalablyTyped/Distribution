organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-7a1a0b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6e4252",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20190322Z-3c9112",
  "org.scalablytyped" %%% "inversify" % "5.0.1-4f7b70",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-e49072",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-4dabf8",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        