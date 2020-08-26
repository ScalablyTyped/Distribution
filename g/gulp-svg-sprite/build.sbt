organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20200515Z-4ceff0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "2.2.0-9758e5",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20200515Z-2d2cee",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-5db8a3",
  "org.scalablytyped" %%% "winston" % "3.3.3-093641",
  "org.scalablytyped" %%% "winston-transport" % "4.4.0-de04f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
