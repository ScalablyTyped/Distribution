organization := "org.scalablytyped"
name := "lumino__datagrid"
version := "0.6.0-6ecf16"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-bf4c20",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.4-d20736",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-89d7c4",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-b18675",
  "org.scalablytyped" %%% "lumino__messaging" % "1.4.3-ee7699",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-6274b9",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-2ee69f",
  "org.scalablytyped" %%% "lumino__widgets" % "1.14.1-2956bb",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
