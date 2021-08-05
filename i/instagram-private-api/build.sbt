organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.43.3-724ac4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-d92e91",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-aa2843",
  "org.scalablytyped" %%% "chance" % "1.1-dt-20200515Z-7e2ddb",
  "org.scalablytyped" %%% "form-data" % "3.0.0-109ff3",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-62b8f4",
  "org.scalablytyped" %%% "luxon" % "1.25-dt-20200918Z-afcadb",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-2b8a20",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-fc5d55",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-b1ecae",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-721f24",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-8a1ccc",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-c6b783",
  "org.scalablytyped" %%% "utility-types" % "3.10.0-5a6bdd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
