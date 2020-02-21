organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.6-dd3bfc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-ea94a2",
  "org.scalablytyped" %%% "log-update" % "3.4.0-a1d548",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-6c716a",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "string-width" % "4.2.0-daa38c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
