organization := "org.scalablytyped"
name := "infinite-scroll"
version := "4.0-dt-20220624Z-295f9e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "isotope-layout" % "3.0-dt-20211202Z-6b864c",
  "org.scalablytyped" %%% "masonry-layout" % "4.2-dt-20220523Z-f9701a",
  "org.scalablytyped" %%% "packery" % "v1.4.1-dt-20230429Z-799617",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
