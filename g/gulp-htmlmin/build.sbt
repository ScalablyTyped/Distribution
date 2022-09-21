organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20220818Z-adaec2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20220921Z-650c8a",
  "org.scalablytyped" %%% "html-minifier" % "4.0-dt-20220913Z-28089c",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20220818Z-7e97f6",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20220913Z-de8502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
