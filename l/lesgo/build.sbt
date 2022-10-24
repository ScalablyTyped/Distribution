organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-483899"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "aws-sdk" % "2.1238.0-8b558f",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-bda57f",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.4.0-3bc1e5",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-ba6586",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-13a914",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-1b5e93",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-c7aee3",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-f4eca6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "undici" % "5.11.0-2ab482")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
