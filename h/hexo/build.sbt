organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190808Z-2c97eb"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-86fa49",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8f9eda",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-8d2c32",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-c2b67b",
  "org.scalablytyped" %%% "moment" % "2.24.0-e628d3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190701Z-99dc01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        