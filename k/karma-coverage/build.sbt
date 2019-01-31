organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-2c8d5c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "flatted" % "2.0.0-c55f79",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-1ffebb",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-e1b88f",
  "org.scalablytyped" %%% "log4js" % "4.0.1-5eee37",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        