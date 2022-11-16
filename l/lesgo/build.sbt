organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-ddd314"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-b44f7d",
  "org.scalablytyped" %%% "aws-sdk" % "2.1255.0-7ae5b6",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-69c77f",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.5.0-3f7ddc",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-85242d",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-a0c016",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-b73df8",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-5f4ca1",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-c84b31",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "undici" % "5.12.0-72c3f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
