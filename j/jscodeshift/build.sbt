organization := "org.scalablytyped"
name := "jscodeshift"
version := "0.7-dt-20201002Z-b09d58"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ast-types" % "0.14.2-2f38be",
  "org.scalablytyped" %%% "babel__parser" % "7.12.7-e54b91",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-b1a5d6",
  "org.scalablytyped" %%% "recast" % "0.19.1-2524cf",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
