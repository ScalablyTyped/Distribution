organization := "org.scalablytyped"
name := "ionic"
version := "4.12.0-44a718"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-831f18",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190522Z-767e1a",
  "org.scalablytyped" %%% "ionic__cli-framework" % "1.7.0-3b1e4f",
  "org.scalablytyped" %%% "ionic__utils-network" % "0.0.8-bf35ff",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-beffa0",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-28294d",
  "org.scalablytyped" %%% "log-update" % "3.2.0-f62d75",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-286446",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-d16f05",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "string-width" % "4.1.0-0cae32",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-58fb79",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-84d8da")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        