organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.30-4703d2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-3f1c68",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-d12ddb",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-065978",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-a2eef9",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4c89f3",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-bbc683",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-6255e6",
  "org.scalablytyped" %%% "isobject" % "3.0.1-9d54b1",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-d23fad",
  "org.scalablytyped" %%% "keycode" % "2.2.0-dd01fb",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.2-3e46ee",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-66ab86",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-5852bc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-1a5d56",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-919ea5",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-cdbeab",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-4c743e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-d21fb1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        