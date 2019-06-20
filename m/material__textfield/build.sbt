organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-179abf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-5b182d",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-28d82e",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-25429a",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-e9fbc2",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-8fc952",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        