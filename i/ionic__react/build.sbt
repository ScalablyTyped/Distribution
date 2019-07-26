organization := "org.scalablytyped"
name := "ionic__react"
version := "0.0.6-58a5cc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-d70631",
  "org.scalablytyped" %%% "ionic__core" % "4.7.0-ab7737",
  "org.scalablytyped" %%% "ionicons" % "4.6.2-b018c8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-d34049",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20190613Z-2215da",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        