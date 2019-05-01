organization := "org.scalablytyped"
name := "http-rx"
version := "2.0-dt-20190113Z-e37996"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-2a9eae",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-38bcb2",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-31c0a9",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-f03909",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d74bf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        