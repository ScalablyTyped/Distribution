organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-6306f8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-238ced",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-552094",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-b0af52",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-00a5a8",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-b38207",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-ee568b",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-fcd5ec",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-ab779d",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-3aba15",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-59f2e2",
  "org.scalablytyped" %%% "log-update" % "4.0.0-d552e6",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20200225Z-69f438",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-d1daa9",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "string-width" % "4.2.0-1d80b3",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200214Z-4d9f0f",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20200227Z-8f643a",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-02ea5e",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200318Z-620d0e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
