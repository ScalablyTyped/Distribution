organization := "org.scalablytyped"
name := "ionic"
version := "5.4.15-c367eb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-960f59",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-e686b4",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-49cf93",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-5f6574",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-6d2c7c",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-254a0c",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-4255c4",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-27bc0c",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-f7eed9",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-5aedc9",
  "org.scalablytyped" %%% "log-update" % "3.3.0-80ca5e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-d3de4a",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-cd90af",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9a5dda",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-50e1f3",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-0b388d",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-58962d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-6209fe",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200115Z-9b706a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        