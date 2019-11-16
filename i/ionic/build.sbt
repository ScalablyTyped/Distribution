organization := "org.scalablytyped"
name := "ionic"
version := "5.4.6-f1d8dc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-331cfe",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-bfdc74",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.0-057725",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.1-d92edf",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-92d639",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-9af50d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.9-4d432c",
  "org.scalablytyped" %%% "log-update" % "3.3.0-4a525a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-3c2e78",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-6ef903",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "string-width" % "4.2.0-e3baca",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-397afa",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-987149")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        