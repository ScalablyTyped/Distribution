organization := "org.scalablytyped"
name := "kap-plugin"
version := "1.0-dt-20200817Z-6f736e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conf" % "7.1.2-45dc8b",
  "org.scalablytyped" %%% "electron-store" % "6.0.1-3cdf77",
  "org.scalablytyped" %%% "got" % "9.6-dt-20200515Z-758e59",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-ad71af",
  "org.scalablytyped" %%% "json-schema-typed" % "7.0.3-fbae5d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-fb70a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
