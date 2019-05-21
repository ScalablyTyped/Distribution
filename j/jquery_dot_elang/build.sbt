organization := "org.scalablytyped"
name := "jquery_dot_elang"
version := "0.5.1-dt-20190322Z-3f775e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-49ff4d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-fbd298",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        