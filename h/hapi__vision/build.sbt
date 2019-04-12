organization := "org.scalablytyped"
name := "hapi__vision"
version := "5.5-dt-20190412Z-01c248"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "handlebars" % "4.1.1-62caff",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-d808f2",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-15179c",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190404Z-ec7bf7",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-85f038",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190404Z-c547ff",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-7dbdfc",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-589eb3",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-7d67b8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-ea22a6",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20190322Z-87cc67",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        