organization := "org.scalablytyped"
name := "jquery_dot_bbq"
version := "1.2-dt-20201030Z-2b9a29"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-87319b",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-1b62ce",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
