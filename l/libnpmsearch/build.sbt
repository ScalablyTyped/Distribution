organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20211223Z-80db21"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-8b3bb1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-2d1740",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-92634e",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-e1eccd",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-2e7867",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-a8775f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
