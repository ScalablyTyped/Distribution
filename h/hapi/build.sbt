organization := "org.scalablytyped"
name := "hapi"
version := "18.0-dt-20201028Z-774df9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-8b7cf5",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-363b4a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-844f18",
  "org.scalablytyped" %%% "joi" % "17.3.0-38d96a",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-15dd66",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-f3caf3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-3be8c9",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-793c84",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
