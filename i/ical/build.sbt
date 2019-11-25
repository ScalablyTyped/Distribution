organization := "org.scalablytyped"
name := "ical"
version := "0.6-dt-20191105Z-4adb53"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-99a672",
  "org.scalablytyped" %%% "form-data" % "2.5.1-1f6071",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-e351f2",
  "org.scalablytyped" %%% "rrule" % "2.6.2-dce53e",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-8d3912")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        