organization := "org.scalablytyped"
name := "jest-environment-puppeteer"
version := "4.3-dt-20190819Z-6add18"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-5712e3",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-604a5a",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "puppeteer" % "1.20-dt-20191003Z-2bd73f",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-b6cc77",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-5a4919")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        