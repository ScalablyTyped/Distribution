organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20190322Z-69bb31"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-0ee919",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-ecd958",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-e1c113",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-ef4bc6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        