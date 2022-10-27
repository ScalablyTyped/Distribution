organization := "org.scalablytyped"
name := "libnpmpublish"
version := "4.0-dt-20220624Z-6c9de9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-385072",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-178c8a",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-262b19",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-c0fcac",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-51157a",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-b885cd",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
