organization := "org.scalablytyped"
name := "http-rx"
version := "2.0-dt-20190113Z-ca844e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0051a6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-0bc71a",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-181a55",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        