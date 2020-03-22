organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.1.1-b465d8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "jss" % "10.1.1-4f8d63",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.1.1-c07cd3",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.1.1-1b4d2e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
