organization := "org.scalablytyped"
name := "material-ui__icons"
version := "3.0.1-0d3cce"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-b84a90",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-02072a",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-6da049",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-7ecca4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-0ae6f5",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-9bc3eb",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-a08f01",
  "org.scalablytyped" %%% "isobject" % "3.0.1-6155a5",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-e05980",
  "org.scalablytyped" %%% "keycode" % "2.2.0-09e765",
  "org.scalablytyped" %%% "material-ui__core" % "3.8.1-c2a792",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-1337f5",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-1d30a6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-8054fe",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180803Z-87944e",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-dbe52f",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181212Z-cab13d",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-292246")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        