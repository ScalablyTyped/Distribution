organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.11.2-d0c5a7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.12-656f5a",
  "org.scalablytyped" %%% "angular__core" % "8.2.12-589bb2",
  "org.scalablytyped" %%% "angular__forms" % "8.2.12-3be5f6",
  "org.scalablytyped" %%% "angular__router" % "8.2.12-8ce727",
  "org.scalablytyped" %%% "ionic__core" % "4.11.2-56a9a8",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-653b9c",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-06bc12",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        