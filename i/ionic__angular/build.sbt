organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.4.2-19e712"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "7.2.15-4371b3",
  "org.scalablytyped" %%% "angular__core" % "7.2.15-b7aff3",
  "org.scalablytyped" %%% "angular__forms" % "7.2.15-f0bf2c",
  "org.scalablytyped" %%% "angular__router" % "7.2.15-309cb6",
  "org.scalablytyped" %%% "ionic__core" % "4.4.2-67c366",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-58c2b6",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        