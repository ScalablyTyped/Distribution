organization := "org.scalablytyped"
name := "jscodeshift"
version := "0.7-dt-20201002Z-148b36"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ast-types" % "0.14.2-f66803",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-799cf5",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-8c7046",
  "org.scalablytyped" %%% "recast" % "0.19.1-ee6454",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
