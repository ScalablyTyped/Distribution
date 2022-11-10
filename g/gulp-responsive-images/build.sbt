organization := "org.scalablytyped"
name := "gulp-responsive-images"
version := "0.0-dt-20220624Z-f77321"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gm" % "1.18-dt-20220530Z-f40f82",
  "org.scalablytyped" %%% "gulp-rename" % "2.0-dt-20220818Z-153f3c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-e54af9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
