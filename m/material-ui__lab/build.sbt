organization := "org.scalablytyped"
name := "material-ui__lab"
version := "4.0.0-alpha.19-c8b046"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-a7ce3f",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-1b74dc",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-92ce89",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-b6ccee",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190607Z-d27fdf",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        