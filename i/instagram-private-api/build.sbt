organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.37.1-b79b82"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-71aa02",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-3beb6a",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20191223Z-3f2bbc",
  "org.scalablytyped" %%% "form-data" % "2.5.1-d5539e",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-0586f7",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-c5c7b2",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9a5dda",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-50e1f3",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-1961cf",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-ccdbaa",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-cdb301")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        