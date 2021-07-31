organization := "org.scalablytyped"
name := "ical"
version := "0.6-dt-20200825Z-84eeff"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-121a7f",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1b5b63",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fd1f78",
  "org.scalablytyped" %%% "rrule" % "2.6.6-e716ba",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-ae5005")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
