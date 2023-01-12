organization := "org.scalablytyped"
name := "jasmine-jquery"
version := "1.5.8-dt-20220818Z-0bc61a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jasmine" % "4.3-dt-20221103Z-f71616",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-33f6f2",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-62291b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
