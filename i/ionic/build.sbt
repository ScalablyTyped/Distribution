organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-10b7a4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-6bed9b",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-357986",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-5cd749",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-407c5e",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-4bfa92",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-c519ac",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-cc6fbf",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-7fbe87",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-d82942",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-c6ac62",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-6b3a52",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-bd7a55",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-0dd117",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-dbc22b",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "string-width" % "5.1.2-e4a09c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-7350c7",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-04cb76",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-d9ee56",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-54fbe6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
