organization := "org.scalablytyped"
name := "inert"
version := "5.1-dt-20190412Z-5546a1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-5c1264",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-5479a7",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-43e988",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-021992",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-6c76f1",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-c223ab",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-7afbb3",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-ae0e0c",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-cbc2df",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        