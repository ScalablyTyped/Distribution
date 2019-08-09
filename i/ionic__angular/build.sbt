organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.7.4-956c8a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.1-2df188",
  "org.scalablytyped" %%% "angular__core" % "8.2.1-4bd9de",
  "org.scalablytyped" %%% "angular__forms" % "8.2.1-762b4f",
  "org.scalablytyped" %%% "angular__router" % "8.2.1-5ac50f",
  "org.scalablytyped" %%% "ionic__core" % "4.7.4-6d1b57",
  "org.scalablytyped" %%% "ionicons" % "4.6.2-88bc89",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-c5f4a8",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        