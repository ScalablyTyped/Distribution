organization := "org.scalablytyped"
name := "ionic"
version := "4.12.0-631c25"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-4b90e8",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190322Z-f1775e",
  "org.scalablytyped" %%% "ionic__cli-framework" % "1.7.0-4d9ec1",
  "org.scalablytyped" %%% "ionic__utils-network" % "0.0.8-18cf53",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-c08eea",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-ee76e3",
  "org.scalablytyped" %%% "log-update" % "3.2.0-322fb8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-e88cfd",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-097134",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "string-width" % "4.1.0-b6f155",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190312Z-beb5a9",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-5aa9b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        