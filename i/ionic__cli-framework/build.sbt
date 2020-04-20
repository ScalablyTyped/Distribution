organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "3.0.6-b66239"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ionic__utils-object" % "1.0.6-555201",
  "org.scalablytyped" %%% "log-update" % "4.0.0-91af2f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20200225Z-66f1d4",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "string-width" % "4.2.0-1d80b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
