organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20220818Z-7912a8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20220921Z-337a0c",
  "org.scalablytyped" %%% "html-minifier" % "4.0-dt-20220913Z-c4385d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20220818Z-0e52a0",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "uglify-js" % "3.17-dt-20221021Z-797199")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
