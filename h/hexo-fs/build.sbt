organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20200515Z-e5f00f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8d4fd2",
  "org.scalablytyped" %%% "chokidar" % "3.4.3-bccb7c",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20201021Z-3f2393",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
