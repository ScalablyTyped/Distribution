organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "2.3.1-51ad01"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-1ee684",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-fb786d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-4e2465",
  "org.scalablytyped" %%% "logform" % "2.2.0-15b769",
  "org.scalablytyped" %%% "matrix-appservice" % "0.7.1-e95077",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-418907",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20200911Z-23506b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "prom-client" % "12.0.0-e757aa",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-805ca8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-e007a0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-22aab1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "winston" % "3.3.3-c007df",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-b49518")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
