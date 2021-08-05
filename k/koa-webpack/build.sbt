organization := "org.scalablytyped"
name := "koa-webpack"
version := "6.0-dt-20200831Z-dc88f5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-d5a941",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-1ee684",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-434816",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-0bcefa",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-fb786d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-4e2465",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-4720bf",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-59beae",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-18e3de",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20201002Z-26b8b4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-418907",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-805ca8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-e007a0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-22aab1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "3.7-dt-20200818Z-072cb9",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20200225Z-49c823",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-8b3f01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
