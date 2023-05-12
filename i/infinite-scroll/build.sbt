organization := "org.scalablytyped"
name := "infinite-scroll"
version := "4.0-dt-20220624Z-ec784d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "isotope-layout" % "3.0-dt-20211202Z-9f9faf",
  "org.scalablytyped" %%% "masonry-layout" % "4.2-dt-20220523Z-04fb44",
  "org.scalablytyped" %%% "packery" % "v1.4.1-dt-20230429Z-5ce77b",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
