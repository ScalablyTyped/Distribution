organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.3.0-b40dad"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "jss" % "10.3.0-e7cbf2",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.1.1-dd1872",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.3.0-2b3a76",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
