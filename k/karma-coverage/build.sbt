organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-9180cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "circular-json" % "0.4-dt-20180214Z-c1f35a",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-ab30a2",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-df49a5",
  "org.scalablytyped" %%% "log4js" % "3.0.6-07dacb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        