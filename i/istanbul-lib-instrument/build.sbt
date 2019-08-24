organization := "org.scalablytyped"
name := "istanbul-lib-instrument"
version := "1.7-dt-20190425Z-a02277"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-a5154a",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-b7155e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04c49c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        