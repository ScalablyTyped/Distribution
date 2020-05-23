organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.40.1-81c018"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200520Z-32ab28",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-cf4980",
  "org.scalablytyped" %%% "chance" % "1.1-dt-20200515Z-7ce443",
  "org.scalablytyped" %%% "form-data" % "3.0.0-81582a",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-9e6f24",
  "org.scalablytyped" %%% "luxon" % "1.24-dt-20200515Z-5a3dac",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fef1ef",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-1eb77e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-d1f890",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-ec5ef6",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-672b1a",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-2e3ffc",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-5569e1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
