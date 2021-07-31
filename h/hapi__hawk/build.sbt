organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200925Z-d69ff9"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-121a7f",
  "org.scalablytyped" %%% "crypto-js" % "v4.0.0-dt-20201006Z-ff8a0b",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1b5b63",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-ffcf70",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-db0802",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-bb1592",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-16f1e5",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-9ba692",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-957ac9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-2e2406",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20200925Z-c3d1ab",
  "org.scalablytyped" %%% "joi" % "17.3.0-91f698",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-3ec634",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fd1f78",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-ae5005")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
