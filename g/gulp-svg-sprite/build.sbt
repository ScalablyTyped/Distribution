organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20230510Z-388ee5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.5.1-81e6b7",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20221206Z-603cec",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-fbd7c2",
  "org.scalablytyped" %%% "winston" % "3.8.2-8faf0a",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-d22b58")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
