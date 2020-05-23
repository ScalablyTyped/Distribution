organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20200515Z-23f6b5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.4.0-81d9ae",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200515Z-32d5c3",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20200515Z-c2d019",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20200515Z-f43e38",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-f9eae7",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200515Z-718c5e",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200515Z-31949f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-eed32d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200515Z-227334")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
