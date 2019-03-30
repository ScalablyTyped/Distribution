organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-6020ab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-043064",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20190322Z-18fc09",
  "org.scalablytyped" %%% "inversify" % "5.0.1-2776b4",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-c457ff",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-6e52d5",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        