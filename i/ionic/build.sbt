organization := "org.scalablytyped"
name := "ionic"
version := "5.2.5-2d40f3"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-c490dc",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-443218",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.4-43ddaa",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.3-8933ce",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.3-5a1056",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.5-3f41dc",
  "org.scalablytyped" %%% "log-update" % "3.2.0-c9e03e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-c2b67b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-1ca89d",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "string-width" % "4.1.0-4fce40",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-f097c9",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-600ed2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        