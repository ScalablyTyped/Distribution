organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-8ba00a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-d571e9",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-c7b394",
  "org.scalablytyped" %%% "form-data" % "4.0.0-928296",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-b5841b",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-5bffc2",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-8b63d6",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-72f8d2",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-c31a42",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-729ae9",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-7114cc",
  "org.scalablytyped" %%% "joi" % "17.6.4-33cc25",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-863518",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-337987")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
