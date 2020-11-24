organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-33d7c9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-1c136d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-423206",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-aa4975",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-1df9fb",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-675254",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-e6b0d2",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-645456",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-d83639",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-492717",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-271af5",
  "org.scalablytyped" %%% "log-update" % "4.0.0-bd0aea",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-c52055",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200713Z-8f59ce",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-8d21ff",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-af84f1",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "string-width" % "4.2.0-4807e0",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-c9c157",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20201117Z-271406",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-aa5679",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-fda7ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
