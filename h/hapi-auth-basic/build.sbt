organization := "org.scalablytyped"
name := "hapi-auth-basic"
version := "5.0.0-dt-20190322Z-ba824c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-7552d8",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-ebb549",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-28bbb1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-13841a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-950001",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aa326f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-9597ab",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-d31d51",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-e684be",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        