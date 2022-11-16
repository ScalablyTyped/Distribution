organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.9.2-43fa8c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "jss" % "10.9.2-68fe49",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.9.2-9e1c03",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.9.2-5133e4",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
