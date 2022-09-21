organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.9.2-5197d7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "jss" % "10.9.2-08d68e",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.9.2-b5441e",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.9.2-3c6543",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
