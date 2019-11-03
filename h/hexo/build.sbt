organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190808Z-edc49b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0da313",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-76449c",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-21ac5b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-ae0c80",
  "org.scalablytyped" %%% "moment" % "2.24.0-3909a2",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190918Z-7ec297")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        