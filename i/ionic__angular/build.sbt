organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.5.0-8671dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "8.0.1-67e386",
  "org.scalablytyped" %%% "angular__core" % "8.0.1-0e199d",
  "org.scalablytyped" %%% "angular__forms" % "8.0.1-9a137f",
  "org.scalablytyped" %%% "angular__router" % "8.0.1-915a25",
  "org.scalablytyped" %%% "ionic__core" % "4.5.0-e35872",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-69bca3",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        