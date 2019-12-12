organization := "org.scalablytyped"
name := "ionic"
version := "5.4.9-5f60d8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-650089",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-ca3bb7",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-070426",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-43dfd1",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.3-b634bc",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.2-1f4d7e",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.6-b6de31",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-b646ba",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-f74e5d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.10-7f54e6",
  "org.scalablytyped" %%% "log-update" % "3.3.0-9563cb",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-eace7d",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-4912fa",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-481954",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.3-99e1b6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-889204",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-89d224",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-dc1a2d",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-70610c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        