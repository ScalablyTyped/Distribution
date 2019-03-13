organization := "org.scalablytyped"
name := "grommet"
version := "2.5.5-be39e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-af0893",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-187d9c",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-40149a",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-788361",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "polished" % "2.3.3-4edcb0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-24375e",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-c52751",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190312Z-652784",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-88ca54",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190223Z-d0b283")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        