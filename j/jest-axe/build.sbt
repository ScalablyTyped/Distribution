organization := "org.scalablytyped"
name := "jest-axe"
version := "2.2-dt-20181205Z-9c1671"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axe-core" % "3.1.2-2bc0aa",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190213Z-802ce8",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-2c6446",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        