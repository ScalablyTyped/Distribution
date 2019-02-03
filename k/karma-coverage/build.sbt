organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-621bb0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-18ad8e",
  "org.scalablytyped" %%% "flatted" % "2.0.0-2feec5",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-2ef38e",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-7c9987",
  "org.scalablytyped" %%% "log4js" % "4.0.1-9cf4b7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        