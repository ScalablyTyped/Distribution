organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20211202Z-bf2c93"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-0b1008",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-6ca4bc",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-c57dc0",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20220818Z-426ca5",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20220819Z-b240d0",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-a8ea5b",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20220421Z-0442fb",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20211202Z-42a042",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-8e3b69",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20211202Z-bff3e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
