organization := "org.scalablytyped"
name := "infinite-scroll"
version := "4.0-dt-20220624Z-6d582a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "isotope-layout" % "3.0-dt-20211202Z-806310",
  "org.scalablytyped" %%% "masonry-layout" % "4.2-dt-20220523Z-17cc6d",
  "org.scalablytyped" %%% "packery" % "v1.4.1-dt-20220818Z-0b55ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
