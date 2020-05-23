organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20200515Z-7ac88c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "3.0.0-4ac9ad",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20200515Z-b02012",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20200515Z-883322",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-eed32d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
