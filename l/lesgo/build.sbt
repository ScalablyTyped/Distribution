organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-d0860c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "aws-sdk" % "2.1239.0-f6cfe9",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-39d28c",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.4.0-cd1fb1",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-0805e7",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-c6f5f6",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-844797",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-4a10c0",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-b7a440",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "undici" % "5.11.0-8e33ae")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
