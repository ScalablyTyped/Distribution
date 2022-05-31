organization := "org.scalablytyped"
name := "hapi__glue"
version := "6.1-dt-20200925Z-46b641"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-82dfc1",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-007b0b",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-d2010b",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-2e431d",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-548048",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-dc1b10",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-ef1bdd",
  "org.scalablytyped" %%% "joi" % "17.3.0-94e9ff",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-6f2a45",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
