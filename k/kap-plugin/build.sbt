organization := "org.scalablytyped"
name := "kap-plugin"
version := "1.0-dt-20200817Z-d46da7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "conf" % "7.1.2-99d120",
  "org.scalablytyped" %%% "electron-store" % "6.0.1-d17faf",
  "org.scalablytyped" %%% "got" % "9.6-dt-20200515Z-fcaff1",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-bfbda9",
  "org.scalablytyped" %%% "json-schema-typed" % "7.0.3-9231db",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-721f24")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
