organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.5.0-d1d460"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-3f908c",
  "org.scalablytyped" %%% "jss" % "10.5.0-acb538",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.5.0-fedc12",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.5.0-a4f9e7",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
