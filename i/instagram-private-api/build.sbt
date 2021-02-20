organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.43.3-6d0119"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8d4fd2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-ee840c",
  "org.scalablytyped" %%% "chance" % "1.1-dt-20200515Z-98b03b",
  "org.scalablytyped" %%% "form-data" % "3.0.0-438be1",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-63fe9a",
  "org.scalablytyped" %%% "luxon" % "1.25-dt-20200918Z-7eea8e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-6ac064",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-09c192",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-1c9095",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-821692",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-b69119",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-db6650",
  "org.scalablytyped" %%% "utility-types" % "3.10.0-95e7be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
