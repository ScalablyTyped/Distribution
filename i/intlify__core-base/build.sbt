organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-414a75"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-3e707d",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-5bea55",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-ff2c01",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-33256d",
  "org.scalablytyped" %%% "source-map" % "0.7.4-01a3bb",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
