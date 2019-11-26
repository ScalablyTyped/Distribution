organization := "org.scalablytyped"
name := "ionic"
version := "5.4.9-90c7c6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-650089",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-c0f921",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.3-8eb20e",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.2-d2b59e",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-7913d6",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-f74e5d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.10-3f5cfb",
  "org.scalablytyped" %%% "log-update" % "3.3.0-8058c7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-eace7d",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-08a2c3",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-e6dd34",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-b68d7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        