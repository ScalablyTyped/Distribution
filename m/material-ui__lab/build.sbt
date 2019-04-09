organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.30-a99af4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-c46729",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-a1baa5",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-742fb4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-69d728",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-4e752f",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-aa9b4e",
  "org.scalablytyped" %%% "isobject" % "3.0.1-bd1fa3",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-bb8362",
  "org.scalablytyped" %%% "keycode" % "2.2.0-8b7eaa",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-3fc7ee",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-46334a",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-bbf92b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-511913",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-9ce58a",
  "org.scalablytyped" %%% "react-transition-group" % "2.8-dt-20190404Z-120838",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-31c3a3",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20190322Z-34051e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        