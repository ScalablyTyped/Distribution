organization := "org.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20190322Z-a46e2f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.1-0f15bd",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-a815bb",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-f27c24",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-c49f29",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-24cccf",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-9d0dd0",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-6c4994",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-cab967",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-5078bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        