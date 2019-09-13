organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-7f2e72"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-a2ed41",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-c563a0",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-541c52",
  "org.scalablytyped" %%% "winston" % "3.2.1-8b9984",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-650c47")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        