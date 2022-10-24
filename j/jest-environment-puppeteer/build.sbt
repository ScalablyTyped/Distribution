organization := "org.scalablytyped"
name := "jest-environment-puppeteer"
version := "5.0-dt-20220428Z-e734bd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "devtools-protocol" % "0.0.1061995-6c2bf2",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "puppeteer" % "19.1.0-e95e86",
  "org.scalablytyped" %%% "puppeteer-core" % "19.1.0-1d3255",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-20cc7d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
