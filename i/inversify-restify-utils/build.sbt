organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-0cfdf5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-5a815f",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180910Z-cae301",
  "org.scalablytyped" %%% "inversify" % "5.0.1-0b5530",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181121Z-44390a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-ca6c6e",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        