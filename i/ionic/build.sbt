organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-7fec96"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-608b00",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-00fd1d",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-03b610",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-ae4035",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-a8afa2",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-144172",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-9a2af5",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-174a92",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-7bdc76",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-d1933f",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-b8f1f3",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-674f1c",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-b29a54",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-fec6f6",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-fb4d97",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "string-width" % "5.1.2-76e9af",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-c75faf",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-207edf",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-91b38e",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
