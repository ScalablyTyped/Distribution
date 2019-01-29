organization := "org.scalablytyped"
name := "hapi-pino"
version := "5.2-dt-20181212Z-59c407"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-34ff31",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190118Z-974f2c",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190119Z-db542a",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-4ef611",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190121Z-b10f91",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-8d1804",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-e4ffa9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190124Z-e8ec1c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-69aed2",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-5ea804",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20181105Z-d613af",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        