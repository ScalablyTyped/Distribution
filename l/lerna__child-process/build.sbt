organization := "org.scalablytyped"
name := "lerna__child-process"
version := "5.1-dt-20220608Z-86f58c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "execa" % "6.1.0-10a797",
  "org.scalablytyped" %%% "lerna__package" % "5.1-dt-20220608Z-630a21",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-c872f9",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
