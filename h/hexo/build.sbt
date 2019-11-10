organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190808Z-d90e11"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-4a145a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1971cc",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-aec8bf",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-3c2e78",
  "org.scalablytyped" %%% "moment" % "2.24.0-122f60",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190918Z-f85423")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        