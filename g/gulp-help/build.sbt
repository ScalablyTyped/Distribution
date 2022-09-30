organization := "org.scalablytyped"
name := "gulp-help"
version := "1.6-dt-20220818Z-c67f49"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-5a5061",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-0adf37",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-eec4ba",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20220818Z-1522bd",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20220819Z-d1db47",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-84ae38",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20211202Z-59cba6",
  "org.scalablytyped" %%% "q" % "1.5-dt-20220819Z-1ac3b1",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20220421Z-7bdc0f",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20211202Z-42a042",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-ff96b7",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20211202Z-905b11")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
