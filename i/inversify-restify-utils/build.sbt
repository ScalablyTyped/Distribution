organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.1-0ee899"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-13582c",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20201002Z-dd8478",
  "org.scalablytyped" %%% "inversify" % "5.0.1-9d0ebb",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20201028Z-00a023",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20200227Z-496982",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
