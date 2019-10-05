organization := "org.scalablytyped"
name := "knockback"
version := "0.0-unknown-dt-20190619Z-b9a5b2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-ad8b6b",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-f791ad",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190819Z-1110e0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-77de40",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190918Z-b6eebd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        