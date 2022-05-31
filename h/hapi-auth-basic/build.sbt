organization := "org.scalablytyped"
name := "hapi-auth-basic"
version := "5.0.0-dt-20201002Z-23a99b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-de0c0e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-34ada1",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-a454ef",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-7b1fa4",
  "org.scalablytyped" %%% "joi" % "17.3.0-94e9ff",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-6f2a45",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-cc5c40",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-0745dc",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-6989a7",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
