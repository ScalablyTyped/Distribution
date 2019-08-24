organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-5ee3bf"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-86fa49",
  "org.scalablytyped" %%% "inversify" % "5.0.1-dd1543",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190716Z-37653e",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-795982",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        