organization := "org.scalablytyped"
name := "knockback"
version := "0.0-unknown-dt-20191015Z-543253"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "backbone" % "1.4-dt-20190619Z-eda6d9",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-d6bfbf",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190819Z-325be5",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-a9f7cc",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "underscore" % "1.9-dt-20191118Z-5b2bcc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        