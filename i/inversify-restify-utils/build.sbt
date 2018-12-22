organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-3d462a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-5e1bdd",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-912e3f",
  "org.scalablytyped" %%% "inversify" % "5.0.1-194fda",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-663b58",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-8ff35c",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        