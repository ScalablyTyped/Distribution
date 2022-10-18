organization := "org.scalablytyped"
name := "koa-docs"
version := "2.1-dt-20211202Z-6fe387"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-a1c931",
  "org.scalablytyped" %%% "busboy" % "1.5-dt-20220624Z-a9358b",
  "org.scalablytyped" %%% "co-body" % "6.1-dt-20211202Z-ec1721",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-897197",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-3b4e14",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-da09f3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "joi" % "17.6.3-651f50",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-fc3ebd",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-a63c65",
  "org.scalablytyped" %%% "koa-joi-router" % "8.0-dt-20220106Z-ddf5d9",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-68fac7",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
