organization := "org.scalablytyped"
name := "guardian__prosemirror-invisibles"
version := "1.2-dt-20190213Z-d6dd42"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-32536a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-23610a",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-f9d4b0",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-00abde",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20190930Z-2f90dd",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        