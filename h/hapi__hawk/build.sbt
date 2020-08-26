organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-20ea34"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-4c00a4",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20200523Z-5e1c94",
  "org.scalablytyped" %%% "form-data" % "3.0.0-d641e7",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-55a486",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-bcfa24",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200722Z-355bac",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-05e2b9",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20200710Z-629d14",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200424Z-5f27ae",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200515Z-3babf7",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-929c30",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20200515Z-821bf9",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-c79aa7",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-09fd47",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-1a740a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
