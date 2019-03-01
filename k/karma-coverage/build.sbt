organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-1f7046"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "flatted" % "2.0.0-014468",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-79959f",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-bf106e",
  "org.scalablytyped" %%% "log4js" % "4.0.2-39e34b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        