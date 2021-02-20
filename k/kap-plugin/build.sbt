organization := "org.scalablytyped"
name := "kap-plugin"
version := "1.0-dt-20200817Z-d68246"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "conf" % "7.1.2-52b7ca",
  "org.scalablytyped" %%% "electron-store" % "6.0.1-609cb5",
  "org.scalablytyped" %%% "got" % "9.6-dt-20200515Z-1e7cad",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-db17a7",
  "org.scalablytyped" %%% "json-schema-typed" % "7.0.3-a7d209",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-821692")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
