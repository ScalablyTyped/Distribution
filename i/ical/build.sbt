organization := "org.scalablytyped"
name := "ical"
version := "0.6-dt-20191105Z-e970f3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-3beb6a",
  "org.scalablytyped" %%% "form-data" % "2.5.1-7e432c",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-728658",
  "org.scalablytyped" %%% "rrule" % "2.6.4-6fbd38",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-d3015d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        