organization := "org.scalablytyped"
name := "jasmine-jquery"
version := "1.5.8-dt-20181026Z-6ee328"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181218Z-909434",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d30f0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e7e832",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        