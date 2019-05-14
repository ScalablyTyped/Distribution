organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20190322Z-114f13"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-ea1817",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e5a95c",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-565daa",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-eaf4e2",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f20c2f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20190322Z-65902e",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-44e2c6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-f98580",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-7bcb00",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-bb35b5",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-471d14")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        