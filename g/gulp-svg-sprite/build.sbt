organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-35d288"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-855427",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-1f5122",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-93d7c4",
  "org.scalablytyped" %%% "winston" % "3.2.1-c556c6",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-0de293")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        