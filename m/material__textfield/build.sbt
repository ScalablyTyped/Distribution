organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20191126Z-047568"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-fa4047",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-e3988b",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-32e2b1",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-2898b2",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-e13bc5",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        