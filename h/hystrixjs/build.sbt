organization := "org.scalablytyped"
name := "hystrixjs"
version := "0.2-dt-20180214Z-d7d9b7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-5d07b3",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-fdbc23",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        