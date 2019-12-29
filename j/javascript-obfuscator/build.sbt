organization := "org.scalablytyped"
name := "javascript-obfuscator"
version := "0.18.8-983e76"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191223Z-225117",
  "org.scalablytyped" %%% "estraverse" % "0.0-unknown-dt-20190322Z-878d9c",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191223Z-0f319a",
  "org.scalablytyped" %%% "inversify" % "5.0.1-29cf9b",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        