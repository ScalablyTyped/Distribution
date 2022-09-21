organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-265c0b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-6b0351",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-67b5c6",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-fb4ccc",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-e80203",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
