organization := "com.scalablytyped"
name := "hapi-decorators"
version := "v0.4.3-dt-20181027Z-2e99c6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-500330",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-981978",
  "com.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-db5334",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-4d9ee8",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-cbdcd6",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-fdb4ff",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-d42ee9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-458a88",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-90a3c7",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        