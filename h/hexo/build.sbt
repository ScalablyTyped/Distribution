organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20200127Z-ea0915"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-e09edc",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-058a79",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-b02bdb",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-69f438",
  "org.scalablytyped" %%% "moment" % "2.24.0-b112e6",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20191118Z-ec5a0d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
