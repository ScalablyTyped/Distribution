organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.6.0-4b9873"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "8.0.3-c240a3",
  "org.scalablytyped" %%% "angular__core" % "8.0.3-810222",
  "org.scalablytyped" %%% "angular__forms" % "8.0.3-07b0d0",
  "org.scalablytyped" %%% "angular__router" % "8.0.3-2173b7",
  "org.scalablytyped" %%% "ionic__core" % "4.6.0-dac93c",
  "org.scalablytyped" %%% "ionicons" % "4.5.10-2-23a2a4",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-990046",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        