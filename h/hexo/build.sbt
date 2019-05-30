organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-5ea9d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-4adf62",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-819901",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-a3b2a7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-4984ba",
  "org.scalablytyped" %%% "moment" % "2.24.0-4b44f7",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190515Z-a22f69")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        