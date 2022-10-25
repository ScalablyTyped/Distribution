organization := "org.scalablytyped"
name := "hydra-box"
version := "0.6-dt-20211202Z-919b3c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clownface" % "1.5-dt-20220824Z-76da6f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "rdf-dataset-indexed" % "0.4-dt-20211202Z-fb59be",
  "org.scalablytyped" %%% "rdf-ext" % "1.3-dt-20211202Z-c8831c",
  "org.scalablytyped" %%% "rdf-loaders-registry" % "0.3-dt-20220624Z-5c1c37",
  "org.scalablytyped" %%% "rdfjs__types" % "1.1.0-572810",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
