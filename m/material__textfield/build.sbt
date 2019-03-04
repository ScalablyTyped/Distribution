organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190213Z-8be697"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-e1c035",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-a534cb",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-00c763",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-e7ff21",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-5f1dee",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        