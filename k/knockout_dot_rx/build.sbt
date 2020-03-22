organization := "org.scalablytyped"
name := "knockout_dot_rx"
version := "1.0-dt-20190322Z-b5aa8c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190819Z-3dc6f9",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-0759c8",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-9110c0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
