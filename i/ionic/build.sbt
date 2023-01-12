organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-fb20af"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-4a1704",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20211202Z-abc15b",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20211202Z-d67e1f",
  "org.scalablytyped" %%% "inquirer" % "9.0-dt-20221107Z-52164f",
  "org.scalablytyped" %%% "ionic__cli-framework" % "5.1.3-4678a1",
  "org.scalablytyped" %%% "ionic__cli-framework-output" % "2.2.5-2fcac0",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "2.1.10-31fbc6",
  "org.scalablytyped" %%% "ionic__discover" % "3.1.5-30c653",
  "org.scalablytyped" %%% "ionic__utils-network" % "2.1.5-5bf7ec",
  "org.scalablytyped" %%% "ionic__utils-object" % "2.1.5-42202a",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "2.1.11-a404ac",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "2.3.3-641359",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20211202Z-e56dbe",
  "org.scalablytyped" %%% "ms" % "v0.7.1-dt-20220818Z-d75a3b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-d48537",
  "org.scalablytyped" %%% "ssh-config" % "4.1.6-e5d276",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "string-width" % "5.1.2-430cd7",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-54cad4",
  "org.scalablytyped" %%% "tar" % "6.1-dt-20220926Z-e0dda2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20220818Z-5d5f40",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
