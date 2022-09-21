organization := "org.scalablytyped"
name := "knockback"
version := "0.0-unknown-dt-20220818Z-670b1b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20220913Z-d88ec5",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-d9fe7d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-964e56",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-09a7be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
