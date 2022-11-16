organization := "org.scalablytyped"
name := "istanbul-lib-instrument"
version := "1.7-dt-20211202Z-ddf294"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-b45c77",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-daefdc",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
