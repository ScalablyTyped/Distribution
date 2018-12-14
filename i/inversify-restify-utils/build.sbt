organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-d093aa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-dd9dec",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180910Z-e22644",
  "org.scalablytyped" %%% "inversify" % "5.0.1-813886",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-080981",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-5decb4",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        