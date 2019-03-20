organization := "org.scalablytyped"
name := "koa-jwt"
version := "3.5.1-51893e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-979bd8",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-6457eb",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ac6a7b",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-b857a2",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9339aa",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-1ff155",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6d51ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-0c8bec",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-07f032",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-52f01b",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-c49bc9",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-96c7ba",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-3d92a5",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2880d6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "p-any" % "2.0.0-bcbb68",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-b27b20",
  "org.scalablytyped" %%% "p-some" % "4.0.0-81ba44",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-2a152d",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "type-fest" % "0.1.0-bc775c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        