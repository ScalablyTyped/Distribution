organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20190322Z-4b8a8f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-418c06",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-f04cdc",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8feecc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04c49c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-05d063")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        