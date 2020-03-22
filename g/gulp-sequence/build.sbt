organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-87526b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-0c7b5f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200226Z-20b3d7",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20200226Z-3cf8ee",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20200225Z-1bf30e",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-1967d2",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200225Z-c2fd9e",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200225Z-769b20",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-55dd5c",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200227Z-5049e1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
