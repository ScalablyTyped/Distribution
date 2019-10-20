organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.5.1-609ae2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-0600a3",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-13e83e",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-c3a5d9",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-91a4b3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20191002Z-3226d9",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        