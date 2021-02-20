organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20201002Z-44917c"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "chalk" % "4.1.0-ea614b",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20200515Z-21eba5",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20201002Z-820201",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-0812a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
