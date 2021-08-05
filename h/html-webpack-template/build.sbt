organization := "org.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20200515Z-2906ab"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-66de25",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-799bc2",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-fbe5c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
