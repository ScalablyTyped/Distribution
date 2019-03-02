organization := "org.scalablytyped"
name := "grommet-icons"
version := "4.2.0-d974e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4ff3b1",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-280c3d",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190214Z-2d625c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        