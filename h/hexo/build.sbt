organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20201002Z-27223f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-af8262",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-df3a73",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-fa9007",
  "org.scalablytyped" %%% "moment" % "2.29.1-445fa8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20201002Z-e8c9e9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
