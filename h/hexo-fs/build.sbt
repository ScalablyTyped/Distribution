organization := "org.scalablytyped"
name := "hexo-fs"
version := "0.2-dt-20190524Z-be2fec"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-2fc7af",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-c1eb4e",
  "org.scalablytyped" %%% "graceful-fs" % "4.1-dt-20190212Z-e8a78f",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
