organization := "org.scalablytyped"
name := "grommet"
version := "2.5.0-fb8bc4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-16b3ff",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-ec3514",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-dbe640",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-cb821d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "polished" % "2.3.3-738e40",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-abf012",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-bd2972",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-f82265",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-7ccebb",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190212Z-499aed")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        