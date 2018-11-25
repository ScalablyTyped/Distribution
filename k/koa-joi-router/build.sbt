organization := "com.scalablytyped"
name := "koa-joi-router"
version := "5.1-dt-20181120Z-4919c1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-d5158b",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-83ee83",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-6d6e76",
  "com.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-429ad4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-7cbe9d",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-87f8bc",
  "com.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-641cf1",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-8cc4e5",
  "com.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-c9489d",
  "com.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-f448f4",
  "com.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-fc463f",
  "com.scalablytyped" %%% "koa-router" % "v7.x-dt-20181120Z-d70595",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-7c0e63",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        