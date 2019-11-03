organization := "org.scalablytyped"
name := "ionic"
version := "5.4.5-b5aadc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-ce7aa2",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-7f85b1",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.0-c72886",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.1-2a8b9a",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-a27c33",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-7b238a",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.9-1ee192",
  "org.scalablytyped" %%% "log-update" % "3.3.0-d798fb",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-ae0c80",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-06bc12",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "string-width" % "4.1.0-c153b0",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20191028Z-2ad641",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-30386e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        