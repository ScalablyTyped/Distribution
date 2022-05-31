organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20201002Z-58aaa9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-4d424e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-90537c",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-23b986",
  "org.scalablytyped" %%% "moment" % "2.29.1-4a676b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20201002Z-265b4a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
