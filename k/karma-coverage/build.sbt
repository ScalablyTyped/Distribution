organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-2427e5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "flatted" % "2.0.0-2feec5",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-2ef38e",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-9943d8",
  "org.scalablytyped" %%% "log4js" % "4.0.2-cdbff7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        