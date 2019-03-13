organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-3bbf28"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-91c5de",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a9f21d",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-a69825",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "moment" % "2.24.0-1d5d22",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190301Z-46df2e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        