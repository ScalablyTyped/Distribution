organization := "org.scalablytyped"
name := "hast-to-hyperscript"
version := "10.0.1-a133dd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-9dd461",
  "org.scalablytyped" %%% "property-information" % "6.1.1-2cd5bb",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-70245a",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-4e3c7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
