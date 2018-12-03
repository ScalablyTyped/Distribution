organization := "com.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.24-97d288"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d2b0a8",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "debounce" % "1.2-dt-20181203Z-b4da0f",
  "com.scalablytyped" %%% "deepmerge" % "2.2.1-d0c656",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-05e35b",
  "com.scalablytyped" %%% "indefinite-observable" % "1.0.2-19bfe2",
  "com.scalablytyped" %%% "is-plain-object" % "2.0.4-09c4c7",
  "com.scalablytyped" %%% "isobject" % "3.0.1-e233f5",
  "com.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-8fd95a",
  "com.scalablytyped" %%% "keycode" % "2.2.0-7dd102",
  "com.scalablytyped" %%% "material-ui__core" % "3.6.0-253c68",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-28e812",
  "com.scalablytyped" %%% "popper_dot_js" % "1.14.6-6a8603",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0eb952",
  "com.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180910Z-f1edfb",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-035397",
  "com.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-c867d1",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "com.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-d608ff",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        