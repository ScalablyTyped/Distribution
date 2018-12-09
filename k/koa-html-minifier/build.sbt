organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180910Z-b37699"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-db9c57",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-5f074c",
  "org.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20180910Z-b157f3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-95bd8f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-ef0760",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-c7573b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-702174",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20180910Z-6cc182",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-ae5f42",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-9bb5e0",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-3c3b26",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-42698d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-7e710f",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180910Z-2f04ee",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-35654c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-ca77c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        