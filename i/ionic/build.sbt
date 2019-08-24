organization := "org.scalablytyped"
name := "ionic"
version := "5.2.6-26d9a9"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-c490dc",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-581c56",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.5-1a7b64",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.4-2e5797",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.4-e1726a",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.6-80fef4",
  "org.scalablytyped" %%% "log-update" % "3.2.0-ce6f72",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-c2b67b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-8fa5f3",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "string-width" % "4.1.0-a38b3c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-f097c9",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-600ed2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        