organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-35d985"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-fa56cf",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-46bf74",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-000f64",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-1ec825",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-aa0e95",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        