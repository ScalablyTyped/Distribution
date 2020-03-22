organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.39.1-aaee1e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-2fc7af",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191223Z-abb506",
  "org.scalablytyped" %%% "form-data" % "3.0.0-cd343e",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-c18770",
  "org.scalablytyped" %%% "luxon" % "1.21-dt-20191115Z-d75d01",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-b16f5b",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-a3036c",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-f3fc01",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-5d8dbb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
