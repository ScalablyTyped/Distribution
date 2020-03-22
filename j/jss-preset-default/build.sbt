organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.0.4-a19460"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "jss" % "10.0.4-d017cb",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.0.4-b4f873",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.0.4-027ba7",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
