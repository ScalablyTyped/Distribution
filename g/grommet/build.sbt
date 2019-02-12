organization := "org.scalablytyped"
name := "grommet"
version := "2.4.0-b624c5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-16b3ff",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "grommet-icons" % "4.2.0-48257e",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c061a",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-cb821d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "polished" % "2.3.3-738e40",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-7c7ba9",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190120Z-e6b87d",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190131Z-ade71a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        