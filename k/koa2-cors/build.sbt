organization := "org.scalablytyped"
name := "koa2-cors"
version := "2.0-dt-20180214Z-4d00ff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-0bdd08",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-249d28",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-53c35c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-a34c84",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-33b861",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-c31b2e",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-0cd2ad",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-cf9c5c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-b2a1ff",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2b27d0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-201a01",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        