organization := "org.scalablytyped"
name := "jest-each"
version := "24.9.0-ba4443"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-797456",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-dc4163",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-22543c",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-34249b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        