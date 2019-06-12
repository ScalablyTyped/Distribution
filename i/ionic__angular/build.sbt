organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.4.2-c213ef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "8.0.0-e2bbb0",
  "org.scalablytyped" %%% "angular__core" % "8.0.0-89f2e5",
  "org.scalablytyped" %%% "angular__forms" % "8.0.0-7c8d38",
  "org.scalablytyped" %%% "angular__router" % "8.0.0-739cf5",
  "org.scalablytyped" %%% "ionic__core" % "4.4.2-ef8a41",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-69bca3",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        