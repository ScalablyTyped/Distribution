organization := "org.scalablytyped"
name := "hapi__catbox-redis"
version := "5.0-dt-20221026Z-84ff41"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "denque" % "2.1.0-886e6b",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-b18962",
  "org.scalablytyped" %%% "ioredis" % "5.2.4-e59dca",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "redis-errors" % "1.2-dt-20211202Z-55a034",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
