organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20190322Z-a65426"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.1-0c94af",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-57d77b",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-677de3",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-d3253c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ae6cfd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-5eacc1",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-434723",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-f68656",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-f7223c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        