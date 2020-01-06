organization := "org.scalablytyped"
name := "ionic"
version := "5.4.13-d955c1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-960f59",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-e686b4",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-49cf93",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-c6640a",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.5-e9bb7a",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-79371a",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.7-f6eb2d",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-292294",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-f7eed9",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.12-7c142d",
  "org.scalablytyped" %%% "log-update" % "3.3.0-9e77bd",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-d3de4a",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-11d26d",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9a5dda",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-50e1f3",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-823862",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-9e9876",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-b3f3e1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-380026")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        