organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-355ba2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-e48a59",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-1d3aec",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-d10184",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-fd6b19",
  "org.scalablytyped" %%% "source-map" % "0.7.4-5a98dd",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
