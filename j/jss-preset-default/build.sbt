organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.0.3-066373"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "jss" % "10.0.3-ca3ac9",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.0.3-c03ef1",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.0.3-b2a56c",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        