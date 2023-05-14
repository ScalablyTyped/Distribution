organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20221221Z-6c0ed1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-1ebd5d",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-70a5e3",
  "org.scalablytyped" %%% "form-data" % "4.0.0-dd6625",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.1-50c06c",
  "org.scalablytyped" %%% "hapi__catbox" % "12.1.1-59ddc5",
  "org.scalablytyped" %%% "hapi__hapi" % "21.3.2-675d8c",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.1-56bdce",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.1-1d1e74",
  "org.scalablytyped" %%% "hapi__podium" % "5.0.1-a01759",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.1-2e54fd",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20211202Z-0b386f",
  "org.scalablytyped" %%% "hapi__statehood" % "8.1.1-f54731",
  "org.scalablytyped" %%% "joi" % "17.9.2-abf248",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-e7d518",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-1da94b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
