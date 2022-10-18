organization := "org.scalablytyped"
name := "io-ts-types"
version := "0.5.17-4730bc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fp-ts" % "2.13.1-437717",
  "org.scalablytyped" %%% "io-ts" % "2.2.19-a2fb4f",
  "org.scalablytyped" %%% "monocle-ts" % "2.3.13-0edecf",
  "org.scalablytyped" %%% "newtype-ts" % "0.3.5-4c4ab2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
