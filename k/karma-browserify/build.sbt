organization := "org.scalablytyped"
name := "karma-browserify"
version := "7.0-dt-20211202Z-883e13"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20211202Z-fead47",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20211202Z-eb2abb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "watchify" % "3.11-dt-20211202Z-736147")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
