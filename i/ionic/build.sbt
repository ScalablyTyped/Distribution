organization := "org.scalablytyped"
name := "ionic"
version := "5.0.0-cf33a1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-bd1df8",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-4a2153",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.0.0-398832",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.0-7f1793",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.0-b3a55d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.0-932897",
  "org.scalablytyped" %%% "log-update" % "3.2.0-a0613e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-4984ba",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-11b18b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "string-width" % "4.1.0-0cae32",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-9dd53e",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-35ee38")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        