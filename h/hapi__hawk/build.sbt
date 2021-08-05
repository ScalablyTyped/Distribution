organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200925Z-4a34fb"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-aa2843",
  "org.scalablytyped" %%% "crypto-js" % "v4.0.0-dt-20201006Z-6f401b",
  "org.scalablytyped" %%% "form-data" % "3.0.0-109ff3",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-0b46c9",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-378f50",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-99e1ca",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-11e972",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-670aca",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-15c189",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-132e45",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20200925Z-762392",
  "org.scalablytyped" %%% "joi" % "17.3.0-38d96a",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-15dd66",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-2b8a20",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-721f24")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
