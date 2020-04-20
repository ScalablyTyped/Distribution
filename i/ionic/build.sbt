organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-de3e27"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-215616",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-202838",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-9f6621",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-8b5ea8",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-b66239",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-8e83b5",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-704ccd",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-1e5d09",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-555201",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-93eb1b",
  "org.scalablytyped" %%% "log-update" % "4.0.0-91af2f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20200225Z-66f1d4",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-092f45",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-62f03a",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-7f568a",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "string-width" % "4.2.0-1d80b3",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200214Z-58fbf0",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20200227Z-0bd868",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-9f3b8d",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-deeaca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
