organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-3c0c08"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-c9260a",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-ced1eb",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5cef31",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        