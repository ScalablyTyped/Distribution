organization := "org.scalablytyped"
name := "ionic"
version := "5.2.1-61d9f4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-3bed4e",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-92c446",
  "org.scalablytyped" %%% "ionic__cli-framework" % "2.1.1-f01397",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.1-1b62c3",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.1-f79abd",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.3-d454a6",
  "org.scalablytyped" %%% "log-update" % "3.2.0-79715b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-7bd4e1",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-990046",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "string-width" % "4.1.0-0cae32",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-6298dd",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-540bcc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        