organization := "org.scalablytyped"
name := "gulp-terser"
version := "1.2-dt-20211202Z-c2cdc3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-e685a5",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-b18a3d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "terser" % "5.15.1-00ef42")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
