organization := "org.scalablytyped"
name := "hapi-decorators"
version := "v0.4.3-dt-20181027Z-f6870e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-fca4be",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-1a4427",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-0e8a80",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-652f74",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181213Z-cc59b1",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-f160ca",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-584e1d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-beab25",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-41bb3c",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        