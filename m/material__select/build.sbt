organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20191126Z-ddf6bc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-b8d27a",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-23ea66",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-26c330",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        