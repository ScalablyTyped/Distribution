organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-3440d8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-d571e9",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-d6f1d3",
  "org.scalablytyped" %%% "form-data" % "4.0.0-61f56e",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-d618fe",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-b18962",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-36dfc6",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-2a0faa",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-2509e5",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-43ad88",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-9ae8cd",
  "org.scalablytyped" %%% "joi" % "17.7.0-d79f84",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-d27e64",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-69f8b6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
