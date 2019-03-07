organization := "org.scalablytyped"
name := "inert"
version := "5.1-dt-20181022Z-839d98"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-b57e54",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-412fb8",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-554fe9",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-71b677",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-916abe",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-645bab",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-66ec6e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-b722ee",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-7f1a8c",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        