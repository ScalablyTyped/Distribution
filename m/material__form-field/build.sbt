organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20191126Z-4433e4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-bcd36c",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-249f07",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-e33cc7",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
