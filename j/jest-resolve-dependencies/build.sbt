organization := "org.scalablytyped"
name := "jest-resolve-dependencies"
version := "24.9.0-be543f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-68f85b",
  "org.scalablytyped" %%% "callsites" % "3.1.0-e70151",
  "org.scalablytyped" %%% "chalk" % "2.4.2-230665",
  "org.scalablytyped" %%% "expect" % "24.9.0-1e315f",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-de6979",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-38e05f",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-f35c73",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-bd445c",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-653224",
  "org.scalablytyped" %%% "jest-snapshot" % "24.9.0-a18177",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-868810",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-f47ace",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-322d5e",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-558047",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-ba4448",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-1b000b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200108Z-73eb79",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-62354a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        