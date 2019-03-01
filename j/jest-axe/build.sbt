organization := "org.scalablytyped"
name := "jest-axe"
version := "2.2-dt-20181205Z-726c74"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axe-core" % "3.1.2-b22a7f",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190225Z-fcdf03",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-555bdd",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        