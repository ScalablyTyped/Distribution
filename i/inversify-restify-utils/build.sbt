organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-047d8c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-e603a8",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-eda139",
  "org.scalablytyped" %%% "inversify" % "5.0.1-9900e6",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-e3d8f6",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-563b09",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        