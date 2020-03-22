organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.6-72a8d2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-3aba15",
  "org.scalablytyped" %%% "log-update" % "4.0.0-e276b9",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-69f438",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "string-width" % "4.2.0-1d80b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
