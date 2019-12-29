organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.37.1-afe9e0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-21097f",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-3beb6a",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191223Z-225117",
  "org.scalablytyped" %%% "form-data" % "2.5.1-7e432c",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-fccbb7",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-728658",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-64cd03",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d6ecc6",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-d3015d",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-1acf82",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-aa6f91")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        