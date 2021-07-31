organization := "org.scalablytyped"
name := "kap-plugin"
version := "1.0-dt-20200817Z-a574b9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conf" % "7.1.2-b8098c",
  "org.scalablytyped" %%% "electron-store" % "6.0.1-9e152b",
  "org.scalablytyped" %%% "got" % "9.6-dt-20200515Z-42cfc3",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-54c8c7",
  "org.scalablytyped" %%% "json-schema-typed" % "7.0.3-725f2d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-ae5005")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
