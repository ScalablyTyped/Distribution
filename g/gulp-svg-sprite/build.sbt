organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-bbbe8a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-ba716b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-8b9055",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-459738",
  "org.scalablytyped" %%% "winston" % "3.2.1-d62820",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-cdf7ba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        