organization := "org.scalablytyped"
name := "gsheetdb"
version := "1.0-dt-20220421Z-e7fa2e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.0.2-4cd399",
  "org.scalablytyped" %%% "google-auth-library" % "8.6.0-2470e7",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-864b57",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
