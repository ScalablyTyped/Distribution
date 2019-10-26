organization := "org.scalablytyped"
name := "ionic"
version := "5.4.4-c08de1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-ce7aa2",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-e267c3",
  "org.scalablytyped" %%% "ionic__cli-framework" % "3.0.0-be2e93",
  "org.scalablytyped" %%% "ionic__cli-framework-prompts" % "1.0.1-af7046",
  "org.scalablytyped" %%% "ionic__utils-network" % "1.0.5-2da678",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-7b238a",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "1.0.9-be96ad",
  "org.scalablytyped" %%% "log-update" % "3.3.0-0af8d8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-ae0c80",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-06bc12",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "string-width" % "4.1.0-c153b0",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190708Z-417745",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-a21bf3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        