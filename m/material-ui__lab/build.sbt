organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.30-48b407"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-97980e",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-4b2fad",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-b20b9b",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-70f930",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-974c6c",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-12839b",
  "org.scalablytyped" %%% "isobject" % "3.0.1-76e358",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-ab69f1",
  "org.scalablytyped" %%% "keycode" % "2.2.0-1f63ba",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.2-4220cb",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-1c9f17",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-c9b4de",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-7ba1d5",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-f736a7",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-43f0e6",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-990227",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-37cf44")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        