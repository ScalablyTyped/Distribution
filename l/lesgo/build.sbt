organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-204275"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "aws-sdk" % "2.1248.0-bdad9b",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-6f4165",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.5.0-790f5b",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-efbaf8",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-2fd429",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-23291f",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-f675dd",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-046cdc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "undici" % "5.12.0-94fc18")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
