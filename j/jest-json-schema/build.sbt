organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180910Z-357bf3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-5904fe",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-55b1a8",
  "org.scalablytyped" %%% "jest" % "23.3-dt-20181128Z-f0bc30",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-06df8d",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-535255")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        