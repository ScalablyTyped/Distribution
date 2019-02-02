organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20180322Z-e7d86f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-f217f8",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190124Z-cf9cd7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-5a7896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-faabb7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        