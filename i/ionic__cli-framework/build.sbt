organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.6-77a812"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-9ae996",
  "org.scalablytyped" %%% "log-update" % "4.0.0-b020b0",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-23b986",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "string-width" % "4.2.0-c30181")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
