organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20220818Z-7d435b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-68fef1",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20211202Z-16be51",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20220819Z-7bc856",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-342b83")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
