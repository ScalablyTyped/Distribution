organization := "org.scalablytyped"
name := "koa-basic-auth"
version := "2.x-dt-20180910Z-78ebd9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-eed613",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-1e3d17",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-2435e6",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-c836cb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-f86790",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-df22ad",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-f2e347",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-c19616",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-7cf901",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-96bbad",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-8ad61a",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        