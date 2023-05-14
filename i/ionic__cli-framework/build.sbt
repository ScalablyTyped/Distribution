organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "5.1.3-afc8be"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-235d68",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-53e749",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-183662",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20221230Z-1a113b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "string-width" % "6.1.0-73ed10")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
