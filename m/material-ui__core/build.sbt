organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.6.1-90b5bb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-09df87",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181203Z-b414e4",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-131861",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-dc38e6",
  "org.scalablytyped" %%% "indefinite-observable" % "1.0.2-76ec78",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-a550ac",
  "org.scalablytyped" %%% "isobject" % "3.0.1-03410e",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-966674",
  "org.scalablytyped" %%% "keycode" % "2.2.0-842c46",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-663c0b",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-fbe2cc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180910Z-e9cd73",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-65045f",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-4dd8bf",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-529c30")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        