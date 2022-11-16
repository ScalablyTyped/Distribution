organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "5.1.3-32a038"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-84cd12",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-e2c5a7",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-25e2ff",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-1b07bd",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "string-width" % "5.1.2-76e9af")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
