organization := "org.scalablytyped"
name := "ionic"
version := "4.12.0-703572"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-a6a53a",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190424Z-66ffce",
  "org.scalablytyped" %%% "ionic__cli-framework" % "1.7.0-0095d6",
  "org.scalablytyped" %%% "ionic__utils-network" % "0.0.8-2fa18a",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-daaec9",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-f4190d",
  "org.scalablytyped" %%% "log-update" % "3.2.0-434827",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-786af5",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-f03909",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "string-width" % "4.1.0-9e2b1d",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-0f3c54",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-03039d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        