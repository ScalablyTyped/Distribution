organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.3-2a2043"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-8a2cd0",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-37cd34",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-74f5c8",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-74d251",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c843c9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1fde1d",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190607Z-583b2b",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        