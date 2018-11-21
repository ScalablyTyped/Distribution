organization := "com.scalablytyped"
name := "grommet"
version := "2.0.1-e02e99"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "css" % "0.0-unknown-dt-20180910Z-e7bf7a",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "polished" % "1.9.3-497b7e",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-44bb36",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181009Z-140611",
  "com.scalablytyped" %%% "react-waypoint" % "8.0.3-47e80d",
  "com.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-814922",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "styled-components" % "4.1-dt-20181116Z-bae8cb",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        