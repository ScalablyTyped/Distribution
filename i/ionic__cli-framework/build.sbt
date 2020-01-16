organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.6-6d2c7c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-f7eed9",
  "org.scalablytyped" %%% "log-update" % "3.3.0-80ca5e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-d3de4a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "string-width" % "4.2.0-12f758")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        