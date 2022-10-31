organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-cae64d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-d571e9",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-c7b394",
  "org.scalablytyped" %%% "form-data" % "4.0.0-7f61a9",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-b5841b",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-5bffc2",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-68b2b7",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-d0b0c9",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-c31a42",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-fc40fe",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-7114cc",
  "org.scalablytyped" %%% "joi" % "17.6.4-7d6367",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-b76d93",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-337987")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
