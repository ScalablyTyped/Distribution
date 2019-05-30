organization := "org.scalablytyped"
name := "ionic"
version := "5.0.0-47290e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-bd1df8",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-d354e6",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.0.0-bf5c49",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.0-6c805b",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.0-b3a55d",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.0-c3254b",
  "org.scalablytyped" %%% "log-update" % "3.2.0-51204d",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-4984ba",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-11b18b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "string-width" % "4.1.0-0cae32",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-1e17de",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-a756cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        