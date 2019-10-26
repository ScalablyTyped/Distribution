organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-cb5787"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-35e927",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-deeaed",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-b1dfc3",
  "org.scalablytyped" %%% "winston" % "3.2.1-85804f",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-d27ae6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        