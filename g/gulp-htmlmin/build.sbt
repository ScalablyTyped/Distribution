organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20190322Z-a71c14"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-0a2736",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-800e82",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8b29e0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        