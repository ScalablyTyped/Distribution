organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-d2ab8c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-d083cb",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-1c896f",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-8e8e6e",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-cdfd6c",
  "org.scalablytyped" %%% "source-map" % "0.7.4-09b2a8",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
