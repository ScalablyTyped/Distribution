organization := "org.scalablytyped"
name := "hapi-auth-basic"
version := "5.0.0-dt-20190322Z-e2423a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-fef2b5",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-07848f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-d5dcd2",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-97b3b7",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-8ac771",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cb7ee4",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-ce07fc",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-a07bf8",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-238c8b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        