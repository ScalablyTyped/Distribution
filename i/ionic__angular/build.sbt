organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.5.0-c0342a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "8.0.2-bf563c",
  "org.scalablytyped" %%% "angular__core" % "8.0.2-0edfbe",
  "org.scalablytyped" %%% "angular__forms" % "8.0.2-71fd21",
  "org.scalablytyped" %%% "angular__router" % "8.0.2-1a0a31",
  "org.scalablytyped" %%% "ionic__core" % "4.5.0-2624f4",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-990046",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        