organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20200515Z-40a4f0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "logform" % "2.1.2-79c82d",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20200515Z-8d9403",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-eed32d",
  "org.scalablytyped" %%% "winston" % "3.2.1-6eec74",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-61416f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
