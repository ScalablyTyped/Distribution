organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-27bd49"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-69305c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-8ca269",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-8ecbd8",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-a4b209",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f20c2f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-2ffcc7",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-68a5da",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-323dd0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        