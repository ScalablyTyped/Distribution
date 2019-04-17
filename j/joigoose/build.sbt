organization := "org.scalablytyped"
name := "joigoose"
version := "2.0-dt-20180214Z-6e7903"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-9f9dc3",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-daf975",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190411Z-711585",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190408Z-a230db",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        