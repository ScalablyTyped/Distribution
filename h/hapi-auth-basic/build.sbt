organization := "org.scalablytyped"
name := "hapi-auth-basic"
version := "5.0.0-dt-20181027Z-900f10"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-eea1b3",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-19ab3d",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-90dff1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-0492bb",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-f53b7a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-7ba122",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-7ce4b8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-b3d782",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-a43e12",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        