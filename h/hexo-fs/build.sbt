organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20211202Z-e5068f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-408111",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-c8be53",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20211202Z-0e83d1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
