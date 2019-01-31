organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-a7d4ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-66c89e",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-e36b32",
  "org.scalablytyped" %%% "inversify" % "5.0.1-46c61e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-608e0f",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-640832",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        