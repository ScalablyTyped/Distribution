organization := "org.scalablytyped"
name := "grommet"
version := "2.6.5-2bc8e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20190322Z-b3a1b3",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-d695ca",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-ee4549",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "polished" % "2.3.3-5430b2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-348bcf",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190327Z-351457",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-feb316",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190223Z-18ed78")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        