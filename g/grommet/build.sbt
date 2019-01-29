organization := "org.scalablytyped"
name := "grommet"
version := "2.3.1-8b0abf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "css" % "0.0-unknown-dt-20180214Z-6964c6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4bf295",
  "org.scalablytyped" %%% "mobile-detect" % "1.4.3-2a1b56",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "polished" % "2.3.1-4d938d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-9427a2",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190120Z-96122b",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190116Z-cc50b3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        