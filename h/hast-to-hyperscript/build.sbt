organization := "org.scalablytyped"
name := "hast-to-hyperscript"
version := "10.0.1-7c6b71"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8aa810",
  "org.scalablytyped" %%% "property-information" % "6.1.1-c1ad28",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-f6f04e",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-5573c8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
