organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20191126Z-be2bba"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-245800",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-05276f",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-a315c8",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-bce247",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-44e558",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        