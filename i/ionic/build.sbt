organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-a6a553"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-1122ee",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-96a1cd",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-7c4d2d",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-52b1ed",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-9d769d",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-a30583",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-653c0e",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-5ae7b3",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-b3c1fc",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-83bfbf",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-13a1a9",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-214304",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-beb943",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-ed7fc9",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "string-width" % "5.1.2-e4a09c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-c9400f",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-09f59e",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-bafe80",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
