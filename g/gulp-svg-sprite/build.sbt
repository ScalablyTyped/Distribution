organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-525172"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-3e51a7",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-8a0689",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-9a002b",
  "org.scalablytyped" %%% "winston" % "3.2.1-a9b00c",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-0480cf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        