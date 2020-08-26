organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-95e9b7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-de8dbc",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-1db63e",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-1c51b0",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200721Z-bd5cf0",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-5359a1",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-f7bb3f",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-872dd3",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-166b4d",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-36372f",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-285b78",
  "org.scalablytyped" %%% "log-update" % "4.0.0-c1640a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20200515Z-5370ba",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200713Z-5e3440",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "rxjs" % "6.6.2-ccb1c2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.2-08247c",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "string-width" % "4.2.0-109934",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200627Z-0c7a46",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20200227Z-7320c2",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-efda06",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-0157fd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
