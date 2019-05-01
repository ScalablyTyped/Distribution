organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-feea1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-f909d9",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-6279a6",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5c8ca8",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        