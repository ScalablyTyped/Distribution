organization := "org.scalablytyped"
name := "gulp-svgmin"
version := "1.2-dt-20180508Z-96ea46"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-b1a3a1",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-b1dfc3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        