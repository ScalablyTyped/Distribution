organization := "org.scalablytyped"
name := "koa-webpack"
version := "6.0-dt-20211231Z-a9abc8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-3fcf45",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-fdb527",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-0b924b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-bf413b",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fdd79d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-a3843d",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-f9052f",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-dd595f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad9de2",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39",
  "org.scalablytyped" %%% "webpack" % "5.75.0-1b9e73",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-421d0d",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20211223Z-278a45",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
