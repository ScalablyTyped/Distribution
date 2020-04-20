organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.39.2-312111"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-5cd42f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20200402Z-d9eada",
  "org.scalablytyped" %%% "form-data" % "3.0.0-b3cc63",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-b4b17a",
  "org.scalablytyped" %%% "luxon" % "1.22-dt-20200322Z-72c3b3",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-1ebdc6",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-62f03a",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-7f568a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200331Z-cf9c87",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-1d1cd4",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-f5069e",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-d787e5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
