organization := "org.scalablytyped"
name := "koa-jwt"
version := "3.5.1-602598"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5804a4",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-b44f5b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-a8ed72",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-272cb8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6a8dc8",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-897588",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-14c66e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-d8c77b",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-0cd2ad",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-22a521",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-067277",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-cf9c5c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-444d6e",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2b27d0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "p-any" % "2.1.0-d60a0e",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-f198d5",
  "org.scalablytyped" %%% "p-some" % "4.1.0-c64821",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4ceb07",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "type-fest" % "0.3.0-45433e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        