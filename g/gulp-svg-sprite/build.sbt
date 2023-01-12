organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20220818Z-c2392e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "logform" % "2.4.2-22d522",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20221103Z-ca215a",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20221107Z-c56ae4",
  "org.scalablytyped" %%% "winston" % "3.8.2-208a98",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-af6604")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
