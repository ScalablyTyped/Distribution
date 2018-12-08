organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.24-334ea4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181203Z-f43dce",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-cbfb94",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-2965d0",
  "org.scalablytyped" %%% "indefinite-observable" % "1.0.2-f33470",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-7d965d",
  "org.scalablytyped" %%% "isobject" % "3.0.1-381fdb",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-95c5e5",
  "org.scalablytyped" %%% "keycode" % "2.2.0-c006ed",
  "org.scalablytyped" %%% "material-ui__core" % "3.6.1-057191",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-fa39ab",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-8df7a3",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-c1bc9b",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180910Z-00af02",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-f5a922",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-769550",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-5828e4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        