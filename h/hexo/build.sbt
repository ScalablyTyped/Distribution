organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-aa9fb2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20230328Z-ea1cbb",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-19a727",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-877ec7",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-e3380e",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20221230Z-1a113b",
  "org.scalablytyped" %%% "moment" % "2.29.4-62c55d",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20221230Z-78d9c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
