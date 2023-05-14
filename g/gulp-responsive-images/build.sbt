organization := "org.scalablytyped"
name := "gulp-responsive-images"
version := "0.0-dt-20220624Z-609826"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gm" % "1.25-dt-20230313Z-0cb9fb",
  "org.scalablytyped" %%% "gulp-rename" % "2.0-dt-20230510Z-374fc8",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-481065")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
