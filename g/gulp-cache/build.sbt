organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20190322Z-a9a2ab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-080f6b",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-5f9e61",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-e3f096",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-55bee9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        