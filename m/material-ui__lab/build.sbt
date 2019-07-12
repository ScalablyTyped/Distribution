organization := "org.scalablytyped"
name := "material-ui__lab"
version := "4.0.0-alpha.19-ed4434"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-a7ce3f",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-9ab6b9",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-9e66a4",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-b6ccee",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190607Z-e3271a",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        