organization := "org.scalablytyped"
name := "jasmine-jquery"
version := "1.5.8-dt-20181026Z-b66f77"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181218Z-1fafdb",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-c4ac04",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3a6abd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        