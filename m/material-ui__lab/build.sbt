organization := "com.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.22-976e0c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20181102Z-4c332c",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "debounce" % "3.0-dt-20181102Z-0affd3",
  "com.scalablytyped" %%% "deepmerge" % "2.2.1-9c60bf",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20181102Z-ae7b69",
  "com.scalablytyped" %%% "indefinite-observable" % "1.0.1-fa7e1b",
  "com.scalablytyped" %%% "is-plain-object" % "2.0.4-b4e83c",
  "com.scalablytyped" %%% "isobject" % "3.0.1-926e56",
  "com.scalablytyped" %%% "jss" % "9.5-dt-20181102Z-8d6d79",
  "com.scalablytyped" %%% "keycode" % "2.2.0-0bf80c",
  "com.scalablytyped" %%% "material-ui__core" % "3.3.2-7f05e5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-c13ed8",
  "com.scalablytyped" %%% "popper_dot_js" % "1.14.4-e6e20d",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181102Z-1c0420",
  "com.scalablytyped" %%% "react-event-listener" % "0.4-dt-20181102Z-49fd81",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181102Z-338645",
  "com.scalablytyped" %%% "recompose" % "0.27-dt-20181116Z-353c3c",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20181102Z-fa475f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        