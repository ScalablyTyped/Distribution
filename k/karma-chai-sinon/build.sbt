organization := "org.scalablytyped"
name := "karma-chai-sinon"
version := "0.1.5-dt-20190322Z-1fc075"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-6d9029",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190330Z-079ca5",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        