organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-a43166"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-0536f4",
  "org.scalablytyped" %%% "aws-sdk" % "2.1238.0-1ca9ab",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-4f0d14",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.4.0-165894",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-cf4306",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-5458d3",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-e81379",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-251658",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-6169f2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "undici" % "5.11.0-fc484f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
