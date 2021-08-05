organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-42677a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-f7a320",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-64e7b3",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-6c010a",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-0d2080",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-a50415",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-c94a3b",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-228da1",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-90f632",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-ae807e",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-9880bb",
  "org.scalablytyped" %%% "log-update" % "4.0.0-54c3ee",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-35f803",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200713Z-25f47e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-fc5d55",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-b1ecae",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "string-width" % "4.2.0-c30181",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-bc484f",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20201117Z-c6859f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-ad47f2",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-8b3f01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
