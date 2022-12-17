organization := "org.scalablytyped"
name := "io-ts-types"
version := "0.5.17-b93b36"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.13.1-a931b3",
  "org.scalablytyped" %%% "io-ts" % "2.2.19-278a13",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-5383d1",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-0ca116",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
