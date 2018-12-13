organization := "org.scalablytyped"
name := "karma-chai-sinon"
version := "0.1.5-dt-20181213Z-784667"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-6866ba",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181213Z-3fca5e",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        