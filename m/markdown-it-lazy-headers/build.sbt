organization := "org.scalablytyped"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20200515Z-aed584"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-c476b4",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20201109Z-ce9090",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-32ab76",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
