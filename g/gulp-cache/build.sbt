organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20200225Z-70d01f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "3.0.0-a95f79",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20200226Z-6aef6a",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20200307Z-a3eb2a",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-bbc6a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
