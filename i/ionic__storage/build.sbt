organization := "org.scalablytyped"
name := "ionic__storage"
version := "2.2.0-5e97b8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__core" % "8.0.1-0e199d",
  "org.scalablytyped" %%% "localforage" % "1.7.3-aff4a1",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-69bca3",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        