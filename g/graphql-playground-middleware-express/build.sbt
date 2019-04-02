organization := "org.scalablytyped"
name := "graphql-playground-middleware-express"
version := "1.7.12-5e099b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-249d28",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-53c35c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-33b861",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-c31b2e",
  "org.scalablytyped" %%% "graphql-playground-html" % "1.6.12-9eb653",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-201a01",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        