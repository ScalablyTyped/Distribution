organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-0ca086"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-2e67dc",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-b4ce56",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-2cc843",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-bb8752",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-cb33c0",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-f572e0",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-f13565",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-2eef4b",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-c48da1",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-32622d",
  "org.scalablytyped" %%% "log-update" % "4.0.0-4ae802",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20200515Z-db9f67",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200515Z-cc470b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-1eb77e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-d1f890",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "string-width" % "4.2.0-7e82d2",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200515Z-84c279",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20200227Z-69ac9d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-dc9245",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200413Z-19ac01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
