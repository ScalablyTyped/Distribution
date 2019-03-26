organization := "org.scalablytyped"
name := "hapi-decorators"
version := "v0.4.3-dt-20190322Z-2d0579"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-85911d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2fac78",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-b3bc95",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-c90b69",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-e908c8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aebc2d",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-9779a1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-c1eb16",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-6e9894",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        