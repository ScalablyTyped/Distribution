organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-8dd594"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-c546f9",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4db962",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-46d474",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-a678da",
  "org.scalablytyped" %%% "moment" % "2.24.0-fbb2c3",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20190701Z-5dbada")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        