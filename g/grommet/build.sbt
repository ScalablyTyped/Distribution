organization := "org.scalablytyped"
name := "grommet"
version := "2.5.5-e88b72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-3563a4",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-d974e3",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c5ec1",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-73504a",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "polished" % "2.3.3-7fa427",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4ff3b1",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-280c3d",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-5b1783",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190214Z-2d625c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        