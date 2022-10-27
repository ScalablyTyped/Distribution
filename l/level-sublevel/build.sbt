organization := "org.scalablytyped"
name := "level-sublevel"
version := "0.0-unknown-dt-20220818Z-4ad90c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "7.2-dt-20220329Z-08c022",
  "org.scalablytyped" %%% "level-errors" % "3.0-dt-20211202Z-24d7d8",
  "org.scalablytyped" %%% "levelup" % "5.1-dt-20220717Z-ae04d6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
