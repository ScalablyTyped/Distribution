organization := "org.scalablytyped"
name := "http-rx"
version := "1.1-dt-20180621Z-b43a46"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-d86840",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e0579d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2a9ed6",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-04e169",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a8bc3f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        