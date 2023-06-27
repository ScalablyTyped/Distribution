organization := "org.scalablytyped"
name := "knockout_dot_rx"
version := "1.0-dt-20221230Z-be0b06"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20230322Z-346e2b",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20230322Z-5b6111",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
