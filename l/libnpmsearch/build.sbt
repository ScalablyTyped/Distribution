organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-ebcd9b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20191122Z-1c2910",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-f2408b",
  "org.scalablytyped" %%% "npm-registry-fetch" % "4.0-dt-20190925Z-2a17a1",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-f124da",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-916961",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        