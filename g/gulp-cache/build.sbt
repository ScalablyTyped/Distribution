organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20190322Z-417257"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-0dac4f",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-406f36",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-40635e",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-e4e569")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        