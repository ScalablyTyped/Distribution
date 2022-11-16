organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-5b54ed"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-1ebd5d",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-b742dc",
  "org.scalablytyped" %%% "form-data" % "4.0.0-24b0ef",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-895c47",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-b7f2fb",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-d227c2",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-abe48a",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-ea4c5d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-e71e9e",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-004340",
  "org.scalablytyped" %%% "joi" % "17.7.0-985b45",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-c36fd1",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-06bffe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
