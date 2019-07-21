organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.6.2-df3ecb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.1.2-ae4263",
  "org.scalablytyped" %%% "angular__core" % "8.1.2-3733ee",
  "org.scalablytyped" %%% "angular__forms" % "8.1.2-6ff1af",
  "org.scalablytyped" %%% "angular__router" % "8.1.2-d69052",
  "org.scalablytyped" %%% "ionic__core" % "4.6.2-b8d64c",
  "org.scalablytyped" %%% "ionicons" % "4.6.1-3039ad",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        