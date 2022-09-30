organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-e05007"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-ad2647",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-d7c166",
  "org.scalablytyped" %%% "form-data" % "4.0.0-bcc178",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-680d7d",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-45b641",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20220525Z-b2ba33",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-dcfbb6",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-7190cd",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-7d50fe",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-afd223",
  "org.scalablytyped" %%% "joi" % "17.6.2-2be84d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-18d655",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-5a8b8f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
