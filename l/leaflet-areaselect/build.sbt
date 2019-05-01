organization := "org.scalablytyped"
name := "leaflet-areaselect"
version := "0.1-dt-20190213Z-2ba236"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-ed63b4",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190417Z-22d9f1",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        