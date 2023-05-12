organization := "org.scalablytyped"
name := "intl-messageformat"
version := "10.3.5-544269"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.15.0-f0663d",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.4.0-181ce4",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.4.0-382448",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
