organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.7.0-6f72a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.1.3-a58682",
  "org.scalablytyped" %%% "angular__core" % "8.1.3-3733ee",
  "org.scalablytyped" %%% "angular__forms" % "8.1.3-092b9c",
  "org.scalablytyped" %%% "angular__router" % "8.1.3-d65ab2",
  "org.scalablytyped" %%% "ionic__core" % "4.7.0-ab7737",
  "org.scalablytyped" %%% "ionicons" % "4.6.2-b018c8",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-4ab268",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        