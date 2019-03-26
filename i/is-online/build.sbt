organization := "org.scalablytyped"
name := "is-online"
version := "8.1.0-9f0279"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-fa0cc2",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-8b7933",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190312Z-b34f96",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-7e2353",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "p-any" % "2.0.0-265ad7",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-f0fb96",
  "org.scalablytyped" %%% "p-some" % "4.0.0-8878c7",
  "org.scalablytyped" %%% "p-timeout" % "3.0.0-2f6e09",
  "org.scalablytyped" %%% "public-ip" % "2.4-dt-20181212Z-bb3ba4",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-a689e5",
  "org.scalablytyped" %%% "type-fest" % "0.1.0-f7c6c4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        