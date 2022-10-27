organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-6f3c93"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "aws-sdk" % "2.1241.0-732116",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-fd1115",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.4.0-f1f3ca",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-2f8cf8",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-bbff5f",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-561f21",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-779c95",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-7720da",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "undici" % "5.11.0-25563e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
