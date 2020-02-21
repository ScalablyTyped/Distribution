organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-e7fc26"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-514a5d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-231f7d",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-f8c078",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-16b5a8",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-dd3bfc",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-f96725",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-4e4390",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-54a785",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-ea94a2",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-869b4d",
  "org.scalablytyped" %%% "log-update" % "3.4.0-a1d548",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-6c716a",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-2af84c",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9b8c0f",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-f03c74",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "string-width" % "4.2.0-daa38c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200214Z-029b39",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-19bb8c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200121Z-de6228",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200129Z-69f918")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
