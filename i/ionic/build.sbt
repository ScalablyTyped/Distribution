organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-aef8ad"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-da621a",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-6dfedf",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-c17faa",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-edeb2b",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-fff4c7",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-183708",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-19e59a",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-20ec77",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-e0b68f",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-7d74a2",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-d4ac7c",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-ce2e06",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-fb5c8a",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-bb1d3f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-6ed253",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-dfd714",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "string-width" % "5.1.2-83242c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-1f5a1f",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-8ec02f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-1db361",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-cacb98")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
