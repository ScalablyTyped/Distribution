organization := "org.scalablytyped"
name := "joigoose"
version := "2.0-dt-20180214Z-49f867"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-d8b98d",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-f16652",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-2dc025",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190224Z-b4109e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        