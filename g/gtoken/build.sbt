organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.0-f2824a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-26ae5f",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-0f126d",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180910Z-d16ade",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-a8dfd0",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180910Z-4b586c",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        