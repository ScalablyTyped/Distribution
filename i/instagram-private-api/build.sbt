organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.33.0-74bdca"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-104ef4",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-99a672",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191003Z-9f4d40",
  "org.scalablytyped" %%% "form-data" % "2.5.1-1f6071",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-4fa07c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190909Z-e351f2",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-08a2c3",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-8d3912",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-566333",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-d487b0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        