organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20191126Z-97403e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20191126Z-bcd36c",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20191126Z-de0198",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20191126Z-fe66fe",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20191126Z-5ce0fd",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20191126Z-249f07",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
