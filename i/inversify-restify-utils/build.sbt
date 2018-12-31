organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-d63822"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-3531cf",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-436dc0",
  "org.scalablytyped" %%% "inversify" % "5.0.1-6eea1e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-74d983",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-716cbc",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        