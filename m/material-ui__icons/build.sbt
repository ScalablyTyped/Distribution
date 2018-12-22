organization := "org.scalablytyped"
name := "material-ui__icons"
version := "3.0.1-e82895"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180721Z-d403a0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-b9c469",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-7c5ed6",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-8ebb75",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-9becb0",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-908b4e",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-4688d3",
  "org.scalablytyped" %%% "isobject" % "3.0.1-da13b8",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-0efb73",
  "org.scalablytyped" %%% "keycode" % "2.2.0-fa987d",
  "org.scalablytyped" %%% "material-ui__core" % "3.7.1-81d29f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-c6307a",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-a174c0",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-d008b6",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180803Z-76c6f1",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-cbde35",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181212Z-ce28c4",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-43e3c6",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-ce2f42")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        