organization := "org.scalablytyped"
name := "ink-spinner"
version := "2.0-dt-20190225Z-a093f4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-99c1e4",
  "org.scalablytyped" %%% "chalk" % "2.4.2-d27947",
  "org.scalablytyped" %%% "cli-spinners" % "1.3-dt-20190118Z-b5f7ef",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-c289fb",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ccd3b7",
  "org.scalablytyped" %%% "ink" % "0.5-dt-20190126Z-90229f",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-cc56f3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        