organization := "org.scalablytyped"
name := "grommet"
version := "2.5.5-054ed9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-527832",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-63921c",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-80b212",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-f609ad",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "polished" % "2.3.3-dd3f74",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-f7f3c1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-502e31",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-ce30a6",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-3d6e86",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190214Z-9b099e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        