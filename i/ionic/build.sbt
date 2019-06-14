organization := "org.scalablytyped"
name := "ionic"
version := "5.0.2-08bd4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-a9020f",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-3b698e",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.0.2-79bd6e",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-773bee",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-07e5b8",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.2-24ccf3",
  "org.scalablytyped" %%% "log-update" % "3.2.0-058200",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-e79e96",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-69bca3",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "string-width" % "4.1.0-0cae32",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-ce3762",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-534f45")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        