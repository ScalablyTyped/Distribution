organization := "org.scalablytyped"
name := "koa-cache-control"
version := "2.0-dt-20211202Z-2e8bc5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-f0a400",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-e40885",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-baf750",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-bb6352",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-ff8589",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-47eaf3",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
