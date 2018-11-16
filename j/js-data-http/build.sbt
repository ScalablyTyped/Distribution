organization := "com.scalablytyped"
name := "js-data-http"
version := "3.0.1-374568"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chai" % "4.1-dt-20181102Z-6ef031",
  "com.scalablytyped" %%% "js-data" % "3.0.4-6f14bd",
  "com.scalablytyped" %%% "js-data-adapter" % "1.0.0-5277f8",
  "com.scalablytyped" %%% "mocha" % "5.2-dt-20181102Z-a716de",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181102Z-677e75",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        