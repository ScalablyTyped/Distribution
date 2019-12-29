organization := "org.scalablytyped"
name := "material__radio"
version := "0.35-dt-20191126Z-15349a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-fa4047",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-e13bc5",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-848e89",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        