organization := "org.scalablytyped"
name := "io-ts-types"
version := "0.5.17-e4ea3e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.13.1-869a17",
  "org.scalablytyped" %%% "io-ts" % "2.2.19-7a788c",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-67931b",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-4efb03",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
