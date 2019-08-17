organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.2.1-874d80"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-dd4dfb",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-e0b922",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-c3889c",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-5715cf",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20190807Z-8b0b76",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        