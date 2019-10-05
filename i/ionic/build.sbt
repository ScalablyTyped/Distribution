organization := "org.scalablytyped"
name := "ionic"
version := "5.4.2-9fbddd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-812829",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-c9841d",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.7-6bc9ee",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-cfc120",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-eb1f66",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.8-56e34a",
  "org.scalablytyped" %%% "log-update" % "3.3.0-058a02",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ff2bf",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-b128ef",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "string-width" % "4.1.0-c153b0",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-8f497a",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-251f35")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        