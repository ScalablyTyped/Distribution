organization := "com.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-702b15"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bunyan" % "1.8-dt-20181102Z-d016a4",
  "com.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20181102Z-0ad85e",
  "com.scalablytyped" %%% "inversify" % "5.0.1-517b69",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "restify" % "7.2-dt-20181102Z-3bf775",
  "com.scalablytyped" %%% "spdy" % "3.4-dt-20181102Z-12dafe",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        