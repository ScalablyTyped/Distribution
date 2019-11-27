organization := "org.scalablytyped"
name := "ionic"
version := "5.4.9-33353c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-650089",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-cda07e",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.3-d0c21f",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.2-5cfa0e",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-632520",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-f74e5d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.10-9d2470",
  "org.scalablytyped" %%% "log-update" % "3.3.0-29186a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-eace7d",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-08a2c3",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-e0699f",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-12acf5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        