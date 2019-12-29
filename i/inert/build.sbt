organization := "org.scalablytyped"
name := "inert"
version := "5.1-dt-20190412Z-0db0c3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-9bfd31",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-3da977",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-2e87f4",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-1b921f",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-158c1e",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a6d597",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-7fb15a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-4c892f",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-e023a3",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        