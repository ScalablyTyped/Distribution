organization := "org.scalablytyped"
name := "gulp-uglify"
version := "3.0-dt-20191126Z-1ec97f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e7ea21",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-3ef08e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        