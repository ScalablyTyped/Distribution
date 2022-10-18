organization := "org.scalablytyped"
name := "lesgo"
version := "0.7-dt-20220817Z-5e6745"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221012Z-dfe092",
  "org.scalablytyped" %%% "aws-sdk" % "2.1234.0-a86e1b",
  "org.scalablytyped" %%% "data-api-client" % "1.2-dt-20220906Z-ed02da",
  "org.scalablytyped" %%% "elastic__elasticsearch" % "8.4.0-c8f992",
  "org.scalablytyped" %%% "elastic__transport" % "8.2.0-59ac92",
  "org.scalablytyped" %%% "hpagent" % "1.0.0-ea6c07",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-873d36",
  "org.scalablytyped" %%% "memcached" % "2.2-dt-20211202Z-28d364",
  "org.scalablytyped" %%% "mysql2" % "2.3.3-4b41f7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "undici" % "5.11.0-7877c4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
