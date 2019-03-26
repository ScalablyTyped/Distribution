organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.2-44f65d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-43290b",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-7714f8",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-76b51b",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-c37e3c",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-f5f764",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-198863",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-afe393",
  "org.scalablytyped" %%% "isobject" % "3.0.1-745cb6",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-74722a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-d01771",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-f7bb7d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-ab23c8",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-bcfacb",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-0e9e7f",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-0765f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        