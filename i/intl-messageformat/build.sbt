organization := "org.scalablytyped"
name := "intl-messageformat"
version := "10.2.1-06a500"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.13.0-020eee",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.10-ee2fc7",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.14-5fbe6e",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
