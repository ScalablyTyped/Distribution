organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.10.0-fa6fc8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-466f86",
  "org.scalablytyped" %%% "jss" % "10.10.0-d86b08",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.10.0-d2e21b",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.10.0-49df3c",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
