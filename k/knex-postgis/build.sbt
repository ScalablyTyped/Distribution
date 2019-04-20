organization := "org.scalablytyped"
name := "knex-postgis"
version := "0.2-dt-20190314Z-6a5e55"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-e9bc8b",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-72e3ef",
  "org.scalablytyped" %%% "knex" % "0.16.5-479f9d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        