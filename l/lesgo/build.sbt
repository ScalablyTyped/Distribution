organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-f56b0e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "aws-sdk" % "2.1243.0-278cf4",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-ca70bf",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.4.0-74c65d",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-5cce51",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-aff9cb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-17d348",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-29e18b",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-7ef369",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "undici" % "5.12.0-b09b2d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
