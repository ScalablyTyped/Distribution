organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-c1ed75"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-554171",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-7d8f5f",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-c670e0",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-6fc7e3",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
