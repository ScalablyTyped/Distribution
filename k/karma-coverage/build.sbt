organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-ad1e2b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "circular-json" % "0.4-dt-20180214Z-3ffab5",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-2edf33",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-d1a4cb",
  "org.scalablytyped" %%% "log4js" % "3.0.6-9619cd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        