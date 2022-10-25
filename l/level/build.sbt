organization := "org.scalablytyped"
name := "level"
version := "8.0.0-00ae11"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-a7c5aa",
  "org.scalablytyped" %%% "browser-level" % "1.0.1-ce2ba0",
  "org.scalablytyped" %%% "classic-level" % "1.2.0-c6171b",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-9e714b",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-7692bd",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
