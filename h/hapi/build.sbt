organization := "com.scalablytyped"
name := "hapi"
version := "17.6-dt-20181109Z-5d57f9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "boom" % "7.2-dt-20181102Z-4b4a12",
  "com.scalablytyped" %%% "catbox" % "10.0-dt-20181102Z-07b79d",
  "com.scalablytyped" %%% "iron" % "5.0-dt-20181102Z-0965b4",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181102Z-09d993",
  "com.scalablytyped" %%% "mime-db" % "1.27-dt-20181102Z-a1d6bd",
  "com.scalablytyped" %%% "mimos" % "3.0-dt-20181102Z-b2518b",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "podium" % "1.0-dt-20181102Z-6a3b2c",
  "com.scalablytyped" %%% "shot" % "4.0-dt-20181102Z-8203d5",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        