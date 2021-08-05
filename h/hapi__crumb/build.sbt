organization := "org.scalablytyped"
name := "hapi__crumb"
version := "7.3-dt-20200925Z-c7a23c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-0b46c9",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-378f50",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-99e1ca",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-11e972",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-670aca",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-15c189",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-132e45",
  "org.scalablytyped" %%% "joi" % "17.3.0-38d96a",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-15dd66",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
