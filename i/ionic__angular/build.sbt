organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.8.1-c637eb"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.4-5a7f7c",
  "org.scalablytyped" %%% "angular__core" % "8.2.4-2d4c21",
  "org.scalablytyped" %%% "angular__forms" % "8.2.4-c4657f",
  "org.scalablytyped" %%% "angular__router" % "8.2.4-5c5590",
  "org.scalablytyped" %%% "ionic__core" % "4.8.1-6415cb",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-6c3221",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-fc403d",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        