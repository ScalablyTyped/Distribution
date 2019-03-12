organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.2-612a51"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-25d274",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9f8404",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-97980e",
  "org.scalablytyped" %%% "deepmerge" % "3.2.0-4b2fad",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20190212Z-b20b9b",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-7f8230",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-974c6c",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-12839b",
  "org.scalablytyped" %%% "isobject" % "3.0.1-76e358",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-da8a35",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-1c9f17",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-c9b4de",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-24375e",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-020bc5",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20190206Z-c4dcbd",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-9ebe74",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-5925bd",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-37cf44")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        