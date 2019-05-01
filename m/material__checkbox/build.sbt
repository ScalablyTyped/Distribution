organization := "org.scalablytyped"
name := "material__checkbox"
version := "0.35-dt-20190313Z-75a864"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-f909d9",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-2f3f27",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-47f8de",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        