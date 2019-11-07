organization := "org.scalablytyped"
name := "ionic"
version := "5.4.5-2d4747"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-331cfe",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-5d4aa9",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.0-0d84f6",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.1-b96705",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-56fe88",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-9af50d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.9-440a3b",
  "org.scalablytyped" %%% "log-update" % "3.3.0-2332be",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-3c2e78",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-6ef903",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "string-width" % "4.1.0-c153b0",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-6a8e50",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-452830")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        