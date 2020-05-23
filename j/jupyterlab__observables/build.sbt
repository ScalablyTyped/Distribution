organization := "org.scalablytyped"
name := "jupyterlab__observables"
version := "3.1.0-f11e6c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-d92c96",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.3-b5fd57",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.6-fa268a",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-bd0922",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.6-d77f45",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
