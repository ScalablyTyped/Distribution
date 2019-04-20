organization := "org.scalablytyped"
name := "hapi-pino"
version := "5.2-dt-20181212Z-c6f7ae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-937b6e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2a99dd",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190416Z-1443c9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-9eca1e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-daf975",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-329130",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190319Z-95fdfa",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-09fe84",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-293109",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20190212Z-543e3b",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        