organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20201002Z-09765a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.4.3-7dd4e3",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-3075c2",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20201002Z-227c06",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20201002Z-3ba6d0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-bab05f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200902Z-9a8311",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200515Z-15314b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-c002e2",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200515Z-c78791")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
