organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-c5962c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-67eec4",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-69b303",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-0d1bc5",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-931d89",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
