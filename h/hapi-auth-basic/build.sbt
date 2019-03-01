organization := "org.scalablytyped"
name := "hapi-auth-basic"
version := "5.0.0-dt-20181022Z-729a09"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-6e71a0",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-31233f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-f90893",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-43358d",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-d23d37",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-9ef634",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-385173",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-5dab68",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-036772",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        