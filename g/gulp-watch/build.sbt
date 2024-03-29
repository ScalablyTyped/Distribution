organization := "org.scalablytyped"
name := "gulp-watch"
version := "v4.1.1-dt-20220818Z-deba65"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-eec4ba",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20220818Z-1522bd",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-84ae38",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20220819Z-ff96b7",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20211202Z-905b11")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
