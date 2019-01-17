organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.28-a91dc7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-6d1ba2",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-308e80",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-627e6b",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-df20a6",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-690cce",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-df6871",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-8a4afd",
  "org.scalablytyped" %%% "isobject" % "3.0.1-b64845",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-a83d32",
  "org.scalablytyped" %%% "keycode" % "2.2.0-aacdb9",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.0-03734f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-3e4932",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-76e546",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-557855",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180803Z-dad825",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-37a1b1",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181212Z-29f2f4",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-fcf77f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        