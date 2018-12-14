organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20180910Z-52bbc6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-40a1b8",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-5d0cdb",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-cc33e6",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-b77938",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-495c09",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        