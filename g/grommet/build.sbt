organization := "org.scalablytyped"
name := "grommet"
version := "2.6.5-21e632"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20190322Z-af0893",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-162a9b",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-bffeb5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "polished" % "2.3.3-4edcb0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-7f8af2",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190318Z-ad9ab7",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-abb8b0",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190223Z-87262a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        