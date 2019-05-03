organization := "org.scalablytyped"
name := "hapi__h2o2"
version := "8.3-dt-20190425Z-3ef20b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-9c1cb7",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-33458b",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190426Z-82f027",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-0326af",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-fb345a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-e90234",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-18630a",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-fa08e1",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-279468",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        