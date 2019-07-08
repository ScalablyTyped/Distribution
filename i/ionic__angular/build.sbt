organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.6.0-9335cb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.1.0-a987ea",
  "org.scalablytyped" %%% "angular__core" % "8.1.0-c2ce4c",
  "org.scalablytyped" %%% "angular__forms" % "8.1.0-2b7327",
  "org.scalablytyped" %%% "angular__router" % "8.1.0-6fca91",
  "org.scalablytyped" %%% "ionic__core" % "4.6.0-b52fab",
  "org.scalablytyped" %%% "ionicons" % "4.5.10-2-7ec91e",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        