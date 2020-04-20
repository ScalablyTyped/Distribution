organization := "org.scalablytyped"
name := "lumino__datagrid"
version := "0.6.0-8ae27c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-20681f",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.1-c3d523",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.2-769091",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.5-4f5e15",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-e98446",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.5-4057d2",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-2aab2c",
  "org.scalablytyped" %%% "lumino__widgets" % "1.11.1-b1d647",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
