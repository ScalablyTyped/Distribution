organization := "org.scalablytyped"
name := "ionic"
version := "5.4.13-3b631f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-12f277",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190808Z-fc1b8b",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-1d0d0a",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-68b969",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.5-8b380b",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-485bd1",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.7-1239de",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-35a37f",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-d73310",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.12-efbf31",
  "org.scalablytyped" %%% "log-update" % "3.3.0-3941d0",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-c95c3a",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20180214Z-1e085d",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-64cd03",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d6ecc6",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-d3638f",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20190710Z-1ed040",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-bf0667",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-c264c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        