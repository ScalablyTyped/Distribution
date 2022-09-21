organization := "org.scalablytyped"
name := "knockout_dot_rx"
version := "1.0-dt-20211202Z-43e05d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-a1cc09",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20220818Z-93f85a",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
