organization := "org.scalablytyped"
name := "knockout_dot_rx"
version := "1.0-dt-20190322Z-a3d526"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190515Z-ff2b58",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-42a185",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-72523d",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        