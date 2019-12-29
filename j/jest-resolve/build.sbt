organization := "org.scalablytyped"
name := "jest-resolve"
version := "24.9.0-692843"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-5d9733",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-3ca4dc",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-ea8a60",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-824122",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191223Z-dc2042",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3838fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        