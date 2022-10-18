organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.9.2-7fd687"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "jss" % "10.9.2-96812d",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.9.2-01439e",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.9.2-03f1ef",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
