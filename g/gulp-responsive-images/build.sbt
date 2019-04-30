organization := "org.scalablytyped"
name := "gulp-responsive-images"
version := "0.0-dt-20180411Z-68ae45"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "gm" % "1.18-dt-20181108Z-eeef74",
  "org.scalablytyped" %%% "gulp-rename" % "0.0-unknown-dt-20190322Z-3b9723",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        