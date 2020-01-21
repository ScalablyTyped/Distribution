organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190808Z-c3ef56"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-e603a8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-fbb1fc",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-45df85",
  "org.scalablytyped" %%% "moment" % "2.24.0-73a0d6",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20191118Z-b623f2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        