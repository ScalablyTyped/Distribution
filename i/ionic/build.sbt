organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-5b9a7d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-85cccd",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-7a466b",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-3b1f2b",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-be1eb2",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-3f2429",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-89aa22",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-855301",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-dad1e1",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-7da7af",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-28d3d3",
  "org.scalablytyped" %%% "log-update" % "4.0.0-1dc3c3",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-fa9007",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200713Z-c75f32",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-39dd20",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-8b121f",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "string-width" % "4.2.0-ba34cf",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-5c14e7",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20201117Z-0fb11a",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-b7264d",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-518f97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
