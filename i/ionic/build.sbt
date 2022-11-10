organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-b1993f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-e33b78",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-03d2f5",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-9569df",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-18de73",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-c2be7a",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-2215bb",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-f9606c",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-bd7430",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-e7c5d7",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-cf883b",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-51fdad",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-da20ad",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-474370",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-9dc6db",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-b1849b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "string-width" % "5.1.2-83242c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-56331b",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-045df1",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-c2d69f",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-38b082")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
