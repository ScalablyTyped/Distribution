organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-537995"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-6bed9b",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-d881d1",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-357986",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20220928Z-50d3d8",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-badfa1",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-0ade16",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-a37418",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-683717",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-25cce2",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-d82942",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-b68b08",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-cda7ba",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-bd7a55",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-0be45f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-22ee0d",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-dbc22b",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "string-width" % "5.1.2-e4a09c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-14f083",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-5b4628",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-acbdfc",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
