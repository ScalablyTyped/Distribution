organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-29082d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-e10e4c",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-f1b33e",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-a1e9ed",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20230308Z-1fef70",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-afc8be",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-235d68",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-448c8f",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-a36fb5",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-598849",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-53e749",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-66b056",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-183662",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20221230Z-1a113b",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "rxjs" % "7.8.1-1301bf",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-30bfd2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "string-width" % "6.1.0-73ed10",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20230426Z-80c0ce",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20230509Z-aaa5d4",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-176e7e",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-6a0345")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
