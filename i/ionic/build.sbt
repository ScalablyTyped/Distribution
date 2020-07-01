organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-247d6c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-8c92b9",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-70bc6c",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-9361a4",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-17b669",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-156dd5",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-8a902d",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-b13911",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-b23077",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-ff833f",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-9e19de",
  "org.scalablytyped" %%% "log-update" % "4.0.0-075900",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20200515Z-de8103",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200515Z-460af4",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-51c44e",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-9cdce8",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "string-width" % "4.2.0-7e82d2",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200627Z-649ca8",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20200227Z-4c4502",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200515Z-5818d2",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200629Z-e2bf41")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
