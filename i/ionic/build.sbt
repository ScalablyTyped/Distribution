organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-e37bdb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-ed585f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-46fecc",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-3e14f6",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-84bcc0",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-32a038",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-84cd12",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-feed30",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-f749d7",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-f30792",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-e2c5a7",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-cf7359",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-25e2ff",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-1b07bd",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-c5fb11",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-2ac93e",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-d98a41",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "string-width" % "5.1.2-76e9af",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-3c05c4",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-655309",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-48adf0",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
