organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-9cb914"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6e4252",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-1e891a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-2ad77d",
  "org.scalablytyped" %%% "moment" % "2.24.0-584f36",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190322Z-360779")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        