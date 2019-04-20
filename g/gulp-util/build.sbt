organization := "org.scalablytyped"
name := "gulp-util"
version := "3.0-dt-20180315Z-19f624"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-0ee919",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-1775e1",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-d1b565")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        