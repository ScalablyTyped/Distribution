organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "5.1.3-d8c478"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-354b0e",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-7d74a2",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-84173c",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-fb5c8a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "string-width" % "5.1.2-83242c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
