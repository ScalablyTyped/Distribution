organization := "org.scalablytyped"
name := "gulp-sequence"
version := "1.0-dt-20181116Z-fb9241"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.0-837c90",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-f253cc",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-cbdca9",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-489cac",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ae6cfd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-051257",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-434723",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-9bb514",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-ecf1d0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        