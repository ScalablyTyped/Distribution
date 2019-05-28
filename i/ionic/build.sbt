organization := "org.scalablytyped"
name := "ionic"
version := "4.12.0-f37a91"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-527010",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-da8edf",
  "org.scalablytyped" %%% "ionic__cli-framework" % "1.7.0-407a2a",
  "org.scalablytyped" %%% "ionic__utils-network" % "0.0.8-62230c",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-eb7496",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-172f01",
  "org.scalablytyped" %%% "log-update" % "3.2.0-8af81b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-a4867d",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-aa18c5",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "string-width" % "4.1.0-9e2b1d",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-5fb858",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-68ab11")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        