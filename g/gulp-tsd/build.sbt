organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-ca82e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-a238ce",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-01f491",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-b477b8",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-c03df2",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-307dea",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-097e6f",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-9a002b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-b14c54")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        