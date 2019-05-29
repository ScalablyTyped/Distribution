organization := "org.scalablytyped"
name := "material__checkbox"
version := "0.35-dt-20190313Z-2504e8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-c9260a",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-28e7a2",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-129fee",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        