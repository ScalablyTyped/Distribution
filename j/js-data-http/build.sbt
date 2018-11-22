organization := "com.scalablytyped"
name := "js-data-http"
version := "3.0.1-419ba9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-6f0d7d",
  "com.scalablytyped" %%% "js-data" % "3.0.4-b78354",
  "com.scalablytyped" %%% "js-data-adapter" % "1.0.0-ccb162",
  "com.scalablytyped" %%% "mocha" % "5.2-dt-20180910Z-fc938a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181120Z-4fd1ec",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        