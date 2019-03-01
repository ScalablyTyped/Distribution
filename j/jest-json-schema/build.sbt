organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20181205Z-f8fd1f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.2-824407",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-598466",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "jest" % "24.0-dt-20190225Z-fcdf03",
  "org.scalablytyped" %%% "jest-diff" % "20.0-dt-20190212Z-555bdd",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-2503b8",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-4b6ee3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        