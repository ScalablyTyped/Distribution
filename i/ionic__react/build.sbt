organization := "org.scalablytyped"
name := "ionic__react"
version := "0.0.6-f1d332"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190822Z-3f670d",
  "org.scalablytyped" %%% "ionic__core" % "4.8.0-552f80",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-374f29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-router" % "5.0-dt-20190702Z-59bc8e",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20190822Z-871e28",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        