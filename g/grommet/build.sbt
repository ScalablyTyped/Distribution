organization := "org.scalablytyped"
name := "grommet"
version := "2.3.1-477180"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-9ba613",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-282e3f",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-5abc82",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "polished" % "2.3.1-f6cf98",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-9c8d5f",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190120Z-c99608",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190131Z-e71da9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        