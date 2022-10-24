organization := "org.scalablytyped"
name := "intl-messageformat"
version := "10.2.1-417c1f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formatjs__ecma402-abstract" % "1.13.0-08da14",
  "org.scalablytyped" %%% "formatjs__icu-messageformat-parser" % "2.1.10-5b2cd3",
  "org.scalablytyped" %%% "formatjs__icu-skeleton-parser" % "1.3.14-ac4d74",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
