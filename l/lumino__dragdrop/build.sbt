organization := "org.scalablytyped"
name := "lumino__dragdrop"
version := "1.5.1-c4ffa6"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-20681f",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.2-769091",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.5-4f5e15",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.5-4057d2",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
