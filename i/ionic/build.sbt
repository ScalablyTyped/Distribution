organization := "org.scalablytyped"
name := "ionic"
version := "5.4.12-44ea64"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-650089",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-ca3bb7",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-070426",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-79aec5",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.5-91f030",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-1bf79b",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.7-d292e9",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-01975d",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-e60a75",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.12-4fc0de",
  "org.scalablytyped" %%% "log-update" % "3.3.0-0feda5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-eace7d",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-ddaf01",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-481954",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.3-99e1b6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-55cad8",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-e10aaf",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-a84da5",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-3445a5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        