organization := "com.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.20-c0977b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d7884f",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "debounce" % "3.0-dt-20181018Z-8bf8bb",
  "com.scalablytyped" %%% "deepmerge" % "2.2.1-9b2a57",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-19b6d2",
  "com.scalablytyped" %%% "indefinite-observable" % "1.0.1-1c5d3f",
  "com.scalablytyped" %%% "is-plain-object" % "2.0.4-859b45",
  "com.scalablytyped" %%% "isobject" % "3.0.1-771227",
  "com.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-441363",
  "com.scalablytyped" %%% "keycode" % "2.2.0-d8e52c",
  "com.scalablytyped" %%% "material-ui__core" % "3.2.2-638937",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-69add7",
  "com.scalablytyped" %%% "popper_dot_js" % "1.14.4-2c189a",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-3e11f7",
  "com.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180910Z-3bb52e",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-b9d453",
  "com.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-3d64cf",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-e6336c",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-ab83dd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        