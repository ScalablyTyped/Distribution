organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.25-3d0671"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-c23652",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181203Z-06d923",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-b7a925",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-2b5950",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-352386",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-4e2273",
  "org.scalablytyped" %%% "isobject" % "3.0.1-391574",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-f3f4a8",
  "org.scalablytyped" %%% "keycode" % "2.2.0-9acf8a",
  "org.scalablytyped" %%% "material-ui__core" % "3.6.2-09bd50",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-7fb1bc",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-4cdde6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-296d60",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-c9a723",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180910Z-bd5c5e",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-4f97e6",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181213Z-d6d432",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-67a080")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        