organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.4.3-e6c941"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-0600a3",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-106231",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-320547",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-dc7826",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20191002Z-31b9b0",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        