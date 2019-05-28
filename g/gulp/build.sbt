organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-5b75e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.0-1b4c05",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-6a3ea3",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-e736c6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f20c2f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-a9315f",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-99c7ed",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-73e3fa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        