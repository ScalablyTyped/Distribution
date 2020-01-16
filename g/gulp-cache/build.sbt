organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20190322Z-133b40"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-40fe0b",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-24b004",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-db1308",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-f89933")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        