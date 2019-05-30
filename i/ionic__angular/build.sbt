organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.4.2-3cdc50"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "8.0.0-57df34",
  "org.scalablytyped" %%% "angular__core" % "8.0.0-77daa1",
  "org.scalablytyped" %%% "angular__forms" % "8.0.0-bc864c",
  "org.scalablytyped" %%% "angular__router" % "8.0.0-028d17",
  "org.scalablytyped" %%% "ionic__core" % "4.4.2-76505d",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-11b18b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        