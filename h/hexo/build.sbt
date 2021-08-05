organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20201002Z-6ecb7b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-13582c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-9bad86",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-35f803",
  "org.scalablytyped" %%% "moment" % "2.29.1-f52f14",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20201002Z-a16364")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
