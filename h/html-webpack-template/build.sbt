organization := "org.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20200515Z-414cca"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-da4af9",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-3ee0bb",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-5fdd97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
