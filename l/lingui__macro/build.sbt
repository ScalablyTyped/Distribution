organization := "org.scalablytyped"
name := "lingui__macro"
version := "2.7-dt-20190320Z-3ad307"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "lingui__core" % "2.7-dt-20190320Z-cfbb2f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190504Z-19278e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        