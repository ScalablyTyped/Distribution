organization := "org.scalablytyped"
name := "light-my-request"
version := "3.3.0-a4c08f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.10.0-4b0839",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-42ef87",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-63baaa",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-fea888",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-5d06ef",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-8cad7e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        