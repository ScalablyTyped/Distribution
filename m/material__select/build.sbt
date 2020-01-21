organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20191126Z-bf0a6a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-9a5610",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-b510eb",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-f7ce7e",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        