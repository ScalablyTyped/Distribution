organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-48d0af"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-c46671",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180910Z-01c11e",
  "org.scalablytyped" %%% "inversify" % "5.0.1-67f6ee",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-87309a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-1cbb15",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        