organization := "org.scalablytyped"
name := "gulp-util"
version := "3.0-dt-20180315Z-ec9bf0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-080f6b",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-e18a46",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-6e10ca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        