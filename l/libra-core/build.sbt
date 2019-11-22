organization := "org.scalablytyped"
name := "libra-core"
version := "1.0.7-d94f9d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "google-protobuf" % "3.7-dt-20191115Z-3a8e32",
  "org.scalablytyped" %%% "grpc" % "1.21.1-55e681",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-af407f",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        