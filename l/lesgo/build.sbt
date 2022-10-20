organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-4d190f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-0536f4",
  "org.scalablytyped" %%% "aws-sdk" % "2.1236.0-fffeef",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-c275ac",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.4.0-4c586b",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-b0b2c4",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-7f93d8",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-bceeaa",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-ab439a",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-1b908e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "undici" % "5.11.0-853e6f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
