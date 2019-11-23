organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.1-81e75e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.5-9af50d",
  "org.scalablytyped" %%% "log-update" % "3.3.0-6fd294",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-3c2e78",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "string-width" % "4.2.0-e3baca")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        