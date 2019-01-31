organization := "org.scalablytyped"
name := "material-ui__icons"
version := "3.0.2-a4557c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-4ddc67",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-2573e7",
  "org.scalablytyped" %%% "deepmerge" % "3.1.0-11ec61",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-0544e8",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-25c871",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-e70f3c",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-df7e99",
  "org.scalablytyped" %%% "isobject" % "3.0.1-49377b",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-491283",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.1-aaf3a3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-a1f814",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-1467eb",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-e377db",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190123Z-563e8f",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-84400a",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190120Z-1ad5e9",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-3afbda")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        