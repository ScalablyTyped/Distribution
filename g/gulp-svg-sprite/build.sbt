organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-f7da7c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "2.1.2-976bd2",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-6834dc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-bb6f47",
  "org.scalablytyped" %%% "winston" % "3.2.1-96dba5",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-fe5bee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        