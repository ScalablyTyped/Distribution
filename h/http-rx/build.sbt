organization := "org.scalablytyped"
name := "http-rx"
version := "2.0-dt-20190113Z-3b6dff"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "form-data" % "2.5.1-036886",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-ab6848",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9b8c0f",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-f03c74",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-5ae06d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
