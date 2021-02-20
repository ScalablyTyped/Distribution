organization := "org.scalablytyped"
name := "ionic"
version := "5.4.16-b9fab0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-ba9607",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-c5583a",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-2dd33a",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-07117c",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.6-f98d07",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.4-848a78",
  "org.scalablytyped" %%% "ionic__discover" % "2.0.8-2e02f2",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.6-dc4e24",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-cb11e0",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.13-e47944",
  "org.scalablytyped" %%% "log-update" % "4.0.0-d6ba89",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-607e99",
  "org.scalablytyped" %%% "minipass" % "2.2-dt-20200713Z-ba2369",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-09c192",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-1c9095",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "string-width" % "4.2.0-176994",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-1337a3",
  "org.scalablytyped" %%% "tar" % "4.0-dt-20201117Z-31c2bc",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-0230cb",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9df179")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
