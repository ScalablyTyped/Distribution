organization := "org.scalablytyped"
name := "h2o2"
version := "8.1-dt-20190412Z-7459c3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-62c842",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b66195",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-4aa847",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-a6af0c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-332cbb",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a40537",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c70aeb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-2f0000",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-b4e173",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        