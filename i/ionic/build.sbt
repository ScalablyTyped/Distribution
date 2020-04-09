organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-e6de8a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-238ced",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-552094",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-b0af52",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-6429a4",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-05bd50",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-0d7efd",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-2ab23b",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-32b3c1",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-3aba15",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-8b7dd2",
  "org.scalablytyped" %%% "log-update" % "4.0.0-ccfff6",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20200225Z-69f438",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-51571a",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-f8c277",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-708450",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "string-width" % "4.2.0-1d80b3",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200214Z-a75eef",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20200227Z-f5d4db",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-b4f532",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200318Z-b44f72")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
