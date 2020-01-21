organization := "org.scalablytyped"
name := "inert"
version := "5.1-dt-20190412Z-2600dd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-f209a1",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-bc2b37",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-65a503",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-b06693",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-fa0830",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cef82e",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-f2b7ca",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-469ff5",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-05de5c",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        