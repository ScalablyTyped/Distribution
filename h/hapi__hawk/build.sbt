organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20211202Z-5c14d6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-ad2647",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-bab7af",
  "org.scalablytyped" %%% "form-data" % "4.0.0-86693f",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-dca375",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-4218e0",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20220525Z-0d28aa",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-92431e",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-eddb9d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-8d41cf",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-27d81e",
  "org.scalablytyped" %%% "joi" % "17.6.0-f7916a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-ffe1b3",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-95204d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
