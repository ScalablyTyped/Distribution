organization := "org.scalablytyped"
name := "jsoneditor"
version := "9.9-dt-20220912Z-99c699"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20221103Z-a6ab2e",
  "org.scalablytyped" %%% "ajv" % "8.12.0-aebde1",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "re2" % "1.18.0-6019fb",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-347272")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
