organization := "org.scalablytyped"
name := "io-ts-types"
version := "0.5.17-71efb8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.13.1-e0c87a",
  "org.scalablytyped" %%% "io-ts" % "2.2.19-7cb18d",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-4741ac",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-52d191",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
