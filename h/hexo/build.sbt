organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20201002Z-03dde6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20200515Z-642e90",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20190808Z-9a72de",
  "org.scalablytyped" %%% "minimist" % "1.2-dt-20201106Z-607e99",
  "org.scalablytyped" %%% "moment" % "2.29.1-0456e1",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "underscore" % "1.10-dt-20201002Z-4c7998")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
