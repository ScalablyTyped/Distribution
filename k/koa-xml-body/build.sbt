organization := "org.scalablytyped"
name := "koa-xml-body"
version := "2.0-dt-20180425Z-6ffb9d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e43e8f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e2423e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-99e619",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-2c209f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3f958a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-d79c77",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-bc2a66",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b096d5",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-44c97a",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-90162d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ff7651",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-d55f12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        