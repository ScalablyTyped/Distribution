organization := "org.scalablytyped"
name := "gulp"
version := "4.0-dt-20190405Z-43ea4d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-2710d0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-895b24",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-c01403",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c93eb3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-2669b9",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-e8ff6c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-541c52",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-c0ff24")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        