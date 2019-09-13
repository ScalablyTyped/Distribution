organization := "org.scalablytyped"
name := "jest-environment-puppeteer"
version := "4.3-dt-20190819Z-758756"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-ba42c8",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-b46f74",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "puppeteer" % "1.19-dt-20190812Z-4f9d4d",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190731Z-8dff82",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-755203")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        