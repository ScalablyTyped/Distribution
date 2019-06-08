organization := "org.scalablytyped"
name := "h2o2"
version := "8.1-dt-20190412Z-14a9bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-5e1bbe",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-901851",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-8ebf13",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0ff4fc",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-51779d",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2bedcf",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-85fdc8",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-97f9dc",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-5c6e97",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        