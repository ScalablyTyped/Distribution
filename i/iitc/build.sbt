organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20201111Z-eceb1d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-9fb8ea",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-ec453d",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-9885ce",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20201012Z-0abd6c",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-ba78fd",
  "org.scalablytyped" %%% "spectrum" % "1.5.1-dt-20201002Z-fc9037",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-687f67")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
