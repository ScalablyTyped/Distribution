organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20220910Z-b98b19"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220819Z-8ddcaa",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-3939f3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-ff93c1",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20220911Z-245b08",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-192740",
  "org.scalablytyped" %%% "moment" % "2.29.4-af05ac",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-09a7be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
