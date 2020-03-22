organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-e1093a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-238ced",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-552094",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-b0af52",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-a98e44",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-72a8d2",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-20ebc8",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-f236a9",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-579a4d",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-3aba15",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-2eab46",
  "org.scalablytyped" %%% "log-update" % "4.0.0-e276b9",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-69f438",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-b17daf",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "string-width" % "4.2.0-1d80b3",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200214Z-d32f27",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-ccd2e1",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200121Z-d9d5b7",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-9e5eae")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
