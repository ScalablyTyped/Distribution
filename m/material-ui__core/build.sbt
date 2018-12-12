organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.6.2-0dee0d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-c23652",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181203Z-06d923",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-b7a925",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-3e4f60",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.0-352386",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-4e2273",
  "org.scalablytyped" %%% "isobject" % "3.0.1-391574",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-c8e3bd",
  "org.scalablytyped" %%% "keycode" % "2.2.0-9acf8a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-7fb1bc",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-4cdde6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181212Z-14da82",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-93dab0",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180910Z-99dc06",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-671ec1",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181120Z-41c51b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-343133",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-67a080")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        