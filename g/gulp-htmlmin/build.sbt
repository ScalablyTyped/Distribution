organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20180322Z-dd852e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-ac032f",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-7b1fb6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-eefacf",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        