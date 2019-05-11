organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.4.0-43bc26"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "7.2.15-3d38c6",
  "org.scalablytyped" %%% "angular__core" % "7.2.15-db7e74",
  "org.scalablytyped" %%% "angular__forms" % "7.2.15-717d65",
  "org.scalablytyped" %%% "angular__router" % "7.2.15-ead962",
  "org.scalablytyped" %%% "ionic__core" % "4.4.0-3999e6",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        