organization := "org.scalablytyped"
name := "jss-preset-default"
version := "10.0.3-d46779"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "jss" % "10.0.3-81238f",
  "org.scalablytyped" %%% "jss-plugin-default-unit" % "10.0.3-6926ff",
  "org.scalablytyped" %%% "jss-plugin-rule-value-observable" % "10.0.3-1b0bd5",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        