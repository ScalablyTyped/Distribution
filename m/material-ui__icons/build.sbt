organization := "org.scalablytyped"
name := "material-ui__icons"
version := "3.0.2-26576a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-8c0e09",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-8ac398",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-ecde1e",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-3356d2",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-4bf295",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-d56ce6",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-fee83d",
  "org.scalablytyped" %%% "isobject" % "3.0.1-8800fd",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-401a7f",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.1-2fa628",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-c6c37e",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-703712",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-9427a2",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190123Z-aa35cc",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-773aad",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190120Z-96122b",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-9bcf7b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        