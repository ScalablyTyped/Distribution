organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20200225Z-5403b1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "2.1.2-12eae7",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20200225Z-c4f4a5",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-bbc6a1",
  "org.scalablytyped" %%% "winston" % "3.2.1-6fa9b1",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-c21bb8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
