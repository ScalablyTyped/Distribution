organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20190322Z-a3a6b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-73a986",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-40148f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-707462",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        