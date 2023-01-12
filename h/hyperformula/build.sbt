organization := "org.scalablytyped"
name := "hyperformula"
version := "2.1.0-ad9f1f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-6919ab",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-09b5e6",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-2c8e2e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
