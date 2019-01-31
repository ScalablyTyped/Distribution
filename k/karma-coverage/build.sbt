organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-5a63e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "flatted" % "2.0.0-dc5f4b",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-88ed38",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-445c33",
  "org.scalablytyped" %%% "log4js" % "4.0.1-f52e97",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        