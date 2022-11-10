organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-87cd76"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-22845c",
  "org.scalablytyped" %%% "aws-sdk" % "2.1251.0-cd7d73",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-fc0e8c",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.5.0-f20b37",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-213ee0",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-b070c3",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-832cde",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-2ffb60",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-7ab09c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "undici" % "5.12.0-7a899f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
