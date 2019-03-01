organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.30-549be0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-2b6900",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-d5bcec",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-2ccfe4",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-68c343",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c5ec1",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-b4acab",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-6dffcf",
  "org.scalablytyped" %%% "isobject" % "3.0.1-41a17e",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-d2aea4",
  "org.scalablytyped" %%% "keycode" % "2.2.0-7ed3fc",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.2-47be9b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-726115",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-f5729c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-dfd109",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-11eec4",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-f660b8",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-5b1783",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-80eb49")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        