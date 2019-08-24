organization := "org.scalablytyped"
name := "mapbox__mapbox-sdk"
version := "0.6-dt-20190808Z-6e1159"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-84cce8",
  "org.scalablytyped" %%% "mapbox-gl" % "v0.54.0-dt-20190823Z-2f5536",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        