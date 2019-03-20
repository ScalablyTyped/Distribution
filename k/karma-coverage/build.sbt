organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-aef58d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "flatted" % "2.0.0-6028c6",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-614514",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-57950f",
  "org.scalablytyped" %%% "log4js" % "4.0.2-01f672",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        