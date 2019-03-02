organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-840f4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-b05538",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-e73519",
  "org.scalablytyped" %%% "inversify" % "5.0.1-c990f9",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-bdb40c",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-ff434a",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        