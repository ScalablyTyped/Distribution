organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-0d814d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-035ab6",
  "org.scalablytyped" %%% "formidable" % "1.0.16-dt-20190322Z-8a6cca",
  "org.scalablytyped" %%% "inversify" % "5.0.1-fd9c9e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "restify" % "8.4-dt-20191119Z-5ec632",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-db8714",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        