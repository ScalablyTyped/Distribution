organization := "org.scalablytyped"
name := "gulp-responsive-images"
version := "0.0-dt-20220624Z-aabb0a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gm" % "1.25-dt-20221114Z-50d189",
  "org.scalablytyped" %%% "gulp-rename" % "2.0-dt-20220818Z-01d671",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-04e4a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
