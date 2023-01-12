organization := "org.scalablytyped"
name := "gulp-responsive-images"
version := "0.0-dt-20220624Z-392bb3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gm" % "1.25-dt-20221114Z-4203e8",
  "org.scalablytyped" %%% "gulp-rename" % "2.0-dt-20220818Z-7c67e9",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-c56ae4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
