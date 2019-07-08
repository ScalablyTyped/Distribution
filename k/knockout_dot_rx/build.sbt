organization := "org.scalablytyped"
name := "knockout_dot_rx"
version := "1.0-dt-20190322Z-9e0cf3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190515Z-bca7d5",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-5d07b3",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-dd0e40",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        