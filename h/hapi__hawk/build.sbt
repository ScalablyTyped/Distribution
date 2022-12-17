organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-bc504d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-1ebd5d",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-4dcfa9",
  "org.scalablytyped" %%% "form-data" % "4.0.0-fb5693",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-783f73",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-bc591b",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-353fc4",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-998f17",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-31fcc8",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-2f55b3",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-6c71b2",
  "org.scalablytyped" %%% "joi" % "17.7.0-7c28f2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-8eb35c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-127627")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
