organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.43.3-238a6b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8f0838",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-aa2843",
  "org.scalablytyped" %%% "chance" % "1.1-dt-20200515Z-7be0db",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1ba95a",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-6a2cb3",
  "org.scalablytyped" %%% "luxon" % "1.25-dt-20200918Z-8645fa",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-287250",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-e772da",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-e1471b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-fb70a5",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-905d80",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-1df364",
  "org.scalablytyped" %%% "utility-types" % "3.10.0-f78de7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
