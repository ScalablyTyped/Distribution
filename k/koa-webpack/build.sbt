organization := "org.scalablytyped"
name := "koa-webpack"
version := "6.0-dt-20200831Z-63be38"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-2396e3",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-83e4b4",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-abe02b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-ec699e",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-224cba",
  "org.scalablytyped" %%% "loglevel" % "1.7.0-8481b0",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20201002Z-fa08dc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "3.7-dt-20200818Z-e69dac",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20200225Z-97a558",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-518f97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
