organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-048cb7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-0fb037",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d1a562",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-909c93",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-786af5",
  "org.scalablytyped" %%% "moment" % "2.24.0-5c3468",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190326Z-2336c4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        