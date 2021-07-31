organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.6-3f2429"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-7da7af",
  "org.scalablytyped" %%% "log-update" % "4.0.0-1dc3c3",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-fa9007",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "string-width" % "4.2.0-ba34cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
