organization := "org.scalablytyped"
name := "infinite-scroll"
version := "4.0-dt-20220624Z-b5618f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "isotope-layout" % "3.0-dt-20211202Z-b0e29c",
  "org.scalablytyped" %%% "masonry-layout" % "4.2-dt-20220523Z-9e8650",
  "org.scalablytyped" %%% "packery" % "v1.4.1-dt-20220818Z-de82fb",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
