organization := "org.scalablytyped"
name := "knockback"
version := "0.0-unknown-dt-20190322Z-1f8023"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190425Z-ad4018",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f3f7a8",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190415Z-6d628c",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-fbd298",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190326Z-42ef2e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        