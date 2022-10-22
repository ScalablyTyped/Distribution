organization := "org.scalablytyped"
name := "hapi__cookie"
version := "10.1-dt-20211223Z-55c125"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-7be43c",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-830847",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-bc9639",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-571c40",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-b3ec1d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-de58ae",
  "org.scalablytyped" %%% "joi" % "17.6.3-d2af11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
