organization := "org.scalablytyped"
name := "ionic"
version := "5.0.1-ffc279"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-bd1df8",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-27e2e4",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.0.1-153aa5",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-137a78",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-b3a55d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.1-abd353",
  "org.scalablytyped" %%% "log-update" % "3.2.0-9d89cf",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-4984ba",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-11b18b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "string-width" % "4.1.0-0cae32",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-368a7c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-ece5fa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        