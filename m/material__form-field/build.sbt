organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20190313Z-07c6b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-85716a",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-dcbdb8",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-5a8c72",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        