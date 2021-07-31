organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.43.3-3148cb"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-86bb8c",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-121a7f",
  "org.scalablytyped" %%% "chance" % "1.1-dt-20200515Z-50c999",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1b5b63",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-0a886e",
  "org.scalablytyped" %%% "luxon" % "1.25-dt-20200918Z-28a94f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fd1f78",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-39dd20",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-8b121f",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-ae5005",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-643761",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-b528c9",
  "org.scalablytyped" %%% "utility-types" % "3.10.0-2986a2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
