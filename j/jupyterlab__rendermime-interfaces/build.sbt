organization := "org.scalablytyped"
name := "jupyterlab__rendermime-interfaces"
version := "2.2.0-ad1e49"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-f40a85",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.3-887769",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-4c140e",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-9e7f85",
  "org.scalablytyped" %%% "lumino__messaging" % "1.4.3-367476",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-675b9c",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-91e726",
  "org.scalablytyped" %%% "lumino__widgets" % "1.13.4-8f2c30",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
