organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20190322Z-d72896"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "flatted" % "2.0.0-5cf2f6",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20190322Z-dbc758",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-5ff8c2",
  "org.scalablytyped" %%% "log4js" % "4.1.0-7f01c4",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        