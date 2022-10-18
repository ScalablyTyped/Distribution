organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-f8ff7e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-6f3919",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-d6b5e2",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-ba769c",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-f744d2",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
