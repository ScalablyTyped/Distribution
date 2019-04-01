organization := "org.scalablytyped"
name := "is-online"
version := "8.1.0-5e7fbd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-b44f5b",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-272cb8",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190312Z-744799",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-22a521",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "p-any" % "2.0.0-cf42ec",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-03d86c",
  "org.scalablytyped" %%% "p-some" % "4.0.0-fd513f",
  "org.scalablytyped" %%% "p-timeout" % "3.0.0-484a7f",
  "org.scalablytyped" %%% "public-ip" % "2.4-dt-20181212Z-010139",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "type-fest" % "0.1.0-207b13")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        