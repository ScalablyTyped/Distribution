organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.9.1-6e9f86"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.7-2582c8",
  "org.scalablytyped" %%% "angular__core" % "8.2.7-53ac19",
  "org.scalablytyped" %%% "angular__forms" % "8.2.7-48d678",
  "org.scalablytyped" %%% "angular__router" % "8.2.7-ac6364",
  "org.scalablytyped" %%% "ionic__core" % "4.9.1-fd7076",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-6c3221",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-9938ed",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        