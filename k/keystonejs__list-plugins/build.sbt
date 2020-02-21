organization := "org.scalablytyped"
name := "keystonejs__list-plugins"
version := "5.0-dt-20191115Z-089577"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-cc0ef5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-07dbf2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-f4e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-868c54",
  "org.scalablytyped" %%% "graphql" % "14.6.0-800d77",
  "org.scalablytyped" %%% "keystonejs__fields" % "5.1-dt-20191115Z-c8d778",
  "org.scalablytyped" %%% "keystonejs__keystone" % "5.2-dt-20191231Z-64c4dc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-4fb0bc",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-7c1dac",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-d83efd",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
