organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.33.0-0c1d56"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-104ef4",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-07c5ef",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191003Z-9f4d40",
  "org.scalablytyped" %%% "form-data" % "2.5.1-1835e6",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-4fa07c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-249e4d",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-481954",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.3-99e1b6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-8d3912",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-d89a3a",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-0b0094")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        