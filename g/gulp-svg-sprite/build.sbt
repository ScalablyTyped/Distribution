organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-c81543"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-ee44c5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-aa7c32",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-68a5da",
  "org.scalablytyped" %%% "winston" % "3.2.1-836149",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-0b17c3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        