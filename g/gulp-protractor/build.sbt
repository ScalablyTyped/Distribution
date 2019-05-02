organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20190322Z-9b8357"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-293c83",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-766ce7",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-5be5a6",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-f52cda",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-307dea",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-9ccf07",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-ff772b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-bc732d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        