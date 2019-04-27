organization := "org.scalablytyped"
name := "grpc__proto-loader"
version := "0.4.0-9556e2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-090e63",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        