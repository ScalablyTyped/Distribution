organization := "org.scalablytyped"
name := "hexo"
version := "3.8-dt-20190221Z-eaf4c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-ab8c0c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b0fe56",
  "org.scalablytyped" %%% "hexo-util" % "0.6-dt-20180810Z-be7ed7",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-e88cfd",
  "org.scalablytyped" %%% "moment" % "2.24.0-06383d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190326Z-68d020")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        