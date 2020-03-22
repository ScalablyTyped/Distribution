organization := "org.scalablytyped"
name := "honeybadger"
version := "1.3-dt-20191104Z-e081a4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-c42858",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-058a79",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-641541",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-e6811a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-28020e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
