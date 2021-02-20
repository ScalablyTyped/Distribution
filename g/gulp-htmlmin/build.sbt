organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20201002Z-dfab5b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20201002Z-e0ee4b",
  "org.scalablytyped" %%% "html-minifier" % "4.0-dt-20201002Z-7e4d0a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20201002Z-f493cf",
  "org.scalablytyped" %%% "source-map" % "0.7.3-475dad",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "uglify-js" % "3.11-dt-20201027Z-ae49d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
