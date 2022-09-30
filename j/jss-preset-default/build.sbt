organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.9.2-7feccc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "jss" % "10.9.2-65e5c9",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.9.2-ba1074",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.9.2-7c5efc",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
