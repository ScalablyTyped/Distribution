organization := "org.scalablytyped"
name := "hapi-pino"
version := "5.2-dt-20181212Z-5ddf62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-745bd0",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-c8b399",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-4cd1e9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c5fbbd",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c4b8ce",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-279468",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-04bd28",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190506Z-9147a3",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-feec7c",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-69072c",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-81a12b",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        