organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.3.1-14606c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "7.2.15-46eace",
  "org.scalablytyped" %%% "angular__core" % "7.2.15-3a6b46",
  "org.scalablytyped" %%% "angular__forms" % "7.2.15-f5f040",
  "org.scalablytyped" %%% "angular__router" % "7.2.15-0747ee",
  "org.scalablytyped" %%% "ionic__core" % "4.3.1-4c3a96",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        