organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.4.2-13a434"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "7.2.15-93fa9a",
  "org.scalablytyped" %%% "angular__core" % "7.2.15-56e086",
  "org.scalablytyped" %%% "angular__forms" % "7.2.15-2e9ed6",
  "org.scalablytyped" %%% "angular__router" % "7.2.15-297734",
  "org.scalablytyped" %%% "ionic__core" % "4.4.2-0a2756",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-d16f05",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        