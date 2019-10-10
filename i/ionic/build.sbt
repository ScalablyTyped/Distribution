organization := "org.scalablytyped"
name := "ionic"
version := "5.4.2-1232fe"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-812829",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-eb7b27",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.7-1a9f39",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-79f348",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-eb1f66",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.8-d27ac2",
  "org.scalablytyped" %%% "log-update" % "3.3.0-b93570",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ff2bf",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-b128ef",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "string-width" % "4.1.0-c153b0",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-1773de",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-f77903")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        