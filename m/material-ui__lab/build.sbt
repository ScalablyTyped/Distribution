organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.28-4aa66c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-9719bb",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-71b611",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-b058e5",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-206f57",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-b88ad1",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-7d8cea",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-1113d8",
  "org.scalablytyped" %%% "isobject" % "3.0.1-6beedf",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-340f0b",
  "org.scalablytyped" %%% "keycode" % "2.2.0-868070",
  "org.scalablytyped" %%% "material-ui__core" % "3.8.3-b20e40",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-f4045d",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-fdfa0a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-a4376a",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180803Z-760775",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-454686",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181212Z-11c908",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-0b86c7",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-abe80a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        