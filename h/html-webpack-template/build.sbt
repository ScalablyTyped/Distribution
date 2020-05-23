organization := "org.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20200515Z-5e5671"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-5191e5",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20200515Z-26912e",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20200515Z-99b4b3",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20200515Z-0a17c9",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20200515Z-28c9d2",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200515Z-de971c",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f960ba",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200515Z-5a96a6",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200519Z-c8112b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200515Z-d3982a",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200515Z-c42b06")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
