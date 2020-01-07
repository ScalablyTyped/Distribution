organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190808Z-cf2a91"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-04ae87",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-224a28",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-9842eb",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-d3de4a",
  "org.scalablytyped" %%% "moment" % "2.24.0-d25a29",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20191118Z-51ae26")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        