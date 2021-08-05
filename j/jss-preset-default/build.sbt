organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.5.0-ee6796"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-28b7d6",
  "org.scalablytyped" %%% "jss" % "10.5.0-2bdc57",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.5.0-5dafad",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.5.0-cd97b5",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
