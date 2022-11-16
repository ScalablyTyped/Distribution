organization := "org.scalablytyped"
name := "infinite-scroll"
version := "4.0-dt-20220624Z-5f604a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "isotope-layout" % "3.0-dt-20211202Z-4ae722",
  "org.scalablytyped" %%% "masonry-layout" % "4.2-dt-20220523Z-91319c",
  "org.scalablytyped" %%% "packery" % "v1.4.1-dt-20220818Z-507a0c",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
