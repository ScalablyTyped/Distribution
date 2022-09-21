organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-ba8e17"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-232cef",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-139f7f",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-dcaa8d",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220815Z-523527",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-121091",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-24829b",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-c9108e",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-1aeb1c",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-fa0241",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-0fd2b6",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-cb9287",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-2f571b",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-192740",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-6927c6",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "string-width" % "5.1.2-e4a09c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-4c8313",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220801Z-121d76",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-e5e6c8",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-6883ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
