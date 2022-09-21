organization := "org.scalablytyped"
name := "koa-webpack"
version := "6.0-dt-20211231Z-da06a9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-8d6d0a",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-ff93c1",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-3b4e14",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-cb149c",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-bee5c7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aaec85",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-62b434",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-d738e8",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-ca6ee9",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b2feca",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e",
  "org.scalablytyped" %%% "webpack" % "5.74.0-8b6e44",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-d2face",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20211223Z-f0c610",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-6883ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
