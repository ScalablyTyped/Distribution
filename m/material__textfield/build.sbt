organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20191126Z-42bb4d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-f5468b",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-8f0414",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-e66466",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-ed4e6e",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-056815",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
