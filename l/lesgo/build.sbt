organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-5550d3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-b9cdef",
  "org.scalablytyped" %%% "aws-sdk" % "2.1255.0-7c20e6",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-90272f",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.5.0-632784",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-4180cd",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-a529b6",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-e13f73",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-ebb3fb",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-a7452d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "undici" % "5.12.0-719b55")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
