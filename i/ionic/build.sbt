organization := "org.scalablytyped"
name := "ionic"
version := "5.4.15-3beb3c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-b0a46a",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fa372c",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-3747ea",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-9633df",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-773038",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-cbeb4a",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-549505",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-81173f",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-8e0a1b",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-b368c9",
  "org.scalablytyped" %%% "log-update" % "3.3.0-cf2936",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-45df85",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-7e0c96",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-81a9cd",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-a24188",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "string-width" % "4.2.0-5cdb5d",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-ee4590",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-d25bca",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-b35991",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200115Z-c1344d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        