organization := "org.scalablytyped"
name := "koa-passport"
version := "4.0-dt-20180910Z-b49301"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-8771e0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-4656cd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-d4abef",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-47baa6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-a3132b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a3aa42",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-f2e347",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-c19616",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-fa9d40",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-96bbad",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "passport" % "0.4-dt-20181104Z-32abba",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-1add06",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        