organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.9.2-453282"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "jss" % "10.9.2-61af30",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.9.2-cd3b88",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.9.2-c60cc9",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
