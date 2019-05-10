organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.4.0-7630a5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "7.2.15-e86b7b",
  "org.scalablytyped" %%% "angular__core" % "7.2.15-2f0356",
  "org.scalablytyped" %%% "angular__forms" % "7.2.15-6790cd",
  "org.scalablytyped" %%% "angular__router" % "7.2.15-2d658d",
  "org.scalablytyped" %%% "ionic__core" % "4.4.0-a26f0c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        