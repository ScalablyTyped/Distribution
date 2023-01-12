organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "5.1.3-4678a1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-2fcac0",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-42202a",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-641359",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-e56dbe",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "string-width" % "5.1.2-430cd7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
