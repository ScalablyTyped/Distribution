organization := "org.scalablytyped"
name := "koa-bouncer"
version := "6.0.4-dt-20181120Z-c92ad3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-64765f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-d7d4ef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-448588",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-051fbf",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-5ea9ff",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-b93914",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-c1d377",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-d33b83",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-569f2f",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-c67877",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-e9c641",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-de6390",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        