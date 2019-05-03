organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-256df2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-85716a",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-9fcdaf",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-f07e14",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-0fb854",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-dcbdb8",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        