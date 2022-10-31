organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20220818Z-7b074a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chalk" % "5.1.2-70b91c",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20211202Z-bc1571",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20220819Z-ccc991",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-25f09a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
