organization := "org.scalablytyped"
name := "intlify__core-base"
version := "9.2.2-df3142"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "intlify__devtools-if" % "9.2.2-205d9f",
  "org.scalablytyped" %%% "intlify__message-compiler" % "9.2.2-37d342",
  "org.scalablytyped" %%% "intlify__shared" % "9.2.2-c54838",
  "org.scalablytyped" %%% "intlify__vue-devtools" % "9.2.2-64baca",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
