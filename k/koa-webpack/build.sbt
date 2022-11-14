organization := "org.scalablytyped"
name := "koa-webpack"
version := "6.0-dt-20211231Z-434846"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-ea3ef3",
  "org.scalablytyped" %%% "ajv" % "8.11.2-8ddd54",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-c317a9",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-baf750",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-a5f7f1",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aa50bf",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-548241",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-a0340d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "re2" % "1.17.7-349e63",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-91ce3a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tapable" % "2.2.1-8e2762",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-af3fab",
  "org.scalablytyped" %%% "webpack" % "5.75.0-87f58a",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "5.3.3-003603",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20211223Z-59af8e",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-38b082")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
