organization := "org.scalablytyped"
name := "ionic"
version := "5.2.3-0bb052"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-909f6c",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-5660e7",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.2-b54098",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-e062d4",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-4c3f85",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.3-527f46",
  "org.scalablytyped" %%% "log-update" % "3.2.0-22e5ed",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-5d5bf4",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-c5f4a8",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "string-width" % "4.1.0-b10cdb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-57aa16",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-a84add")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        