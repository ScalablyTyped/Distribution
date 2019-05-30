organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20190313Z-d51e15"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-48b229",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-9cc5e6",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-6c4d91",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        