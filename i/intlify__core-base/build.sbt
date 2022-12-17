organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-a84788"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-50769a",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-d8339f",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-239e56",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-be4824",
  "org.scalablytyped" %%% "source-map" % "0.7.4-14f7e0",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
