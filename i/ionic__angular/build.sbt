organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.11.0-40eb9b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.10-92d249",
  "org.scalablytyped" %%% "angular__core" % "8.2.10-379a4d",
  "org.scalablytyped" %%% "angular__forms" % "8.2.10-edefdf",
  "org.scalablytyped" %%% "angular__router" % "8.2.10-e256a6",
  "org.scalablytyped" %%% "ionic__core" % "4.11.0-f9a16c",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-653b9c",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-06bc12",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        