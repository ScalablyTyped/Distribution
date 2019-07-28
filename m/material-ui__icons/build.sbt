organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.2.1-e18ea5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-0dcc62",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-a4abf5",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-142863",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-1a85e7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-ce0842",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20190723Z-0f68bd",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        