organization := "org.scalablytyped"
name := "hapi__hapi"
version := "20.0-dt-20201028Z-bb1592"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-ffcf70",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-db0802",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-16f1e5",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-9ba692",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-957ac9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-2e2406",
  "org.scalablytyped" %%% "joi" % "17.3.0-91f698",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-3ec634",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
