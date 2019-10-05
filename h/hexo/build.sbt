organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190808Z-b18747"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-f7d40f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-62c2b3",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-60e6d0",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ff2bf",
  "org.scalablytyped" %%% "moment" % "2.24.0-376d78",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190918Z-b6eebd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        