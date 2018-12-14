organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.25-275db5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-4a9357",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181203Z-92e7ab",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-487e70",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-5410a5",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-fb3ace",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-e32f59",
  "org.scalablytyped" %%% "isobject" % "3.0.1-2692e1",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181018Z-225825",
  "org.scalablytyped" %%% "keycode" % "2.2.0-9ae7b0",
  "org.scalablytyped" %%% "material-ui__core" % "3.6.2-306527",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-2f06f2",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-1b3ef2",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-71b187",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180910Z-17786c",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-8273af",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181214Z-0636de",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-f84511",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180910Z-f07668")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        