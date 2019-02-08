organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.2-4ec584"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-59a979",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-861aad",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-6f3255",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c061a",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-69abe5",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-bf5a16",
  "org.scalablytyped" %%% "isobject" % "3.0.1-6cae53",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-e944bb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-1fc312",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-be5ab9",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-6fba4f",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-0e5a40",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-78bce0",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190120Z-e6b87d",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-6ba63e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        