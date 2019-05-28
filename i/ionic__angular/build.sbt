organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.4.2-cd9fcb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "7.2.15-1a5a9c",
  "org.scalablytyped" %%% "angular__core" % "7.2.15-bc723b",
  "org.scalablytyped" %%% "angular__forms" % "7.2.15-008de8",
  "org.scalablytyped" %%% "angular__router" % "7.2.15-73f0aa",
  "org.scalablytyped" %%% "ionic__core" % "4.4.2-67c366",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-aa18c5",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        