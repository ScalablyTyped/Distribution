organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.5.0-585cc9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-5f30f8",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-7c803d",
  "org.scalablytyped" %%% "inversify" % "6.0.1-60a540",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-62d53b",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-e213f4",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
