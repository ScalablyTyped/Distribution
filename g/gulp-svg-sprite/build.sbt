organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20181018Z-a8dbfd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6d9978",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-6d853e",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-3326eb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-dfb439",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20181018Z-bd6bd6",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-c053bc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-525e43",
  "org.scalablytyped" %%% "winston" % "3.1.0-e1594a",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-749050")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        