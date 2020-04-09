organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-8aa231"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-d7fd12",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200226Z-5d15ca",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20200226Z-54d2e2",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20200225Z-e314c8",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-1967d2",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200225Z-99dd2c",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200225Z-769b20",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-511df8",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200227Z-37f86c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
