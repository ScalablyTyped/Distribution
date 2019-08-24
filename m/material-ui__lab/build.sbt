organization := "org.scalablytyped"
name := "material-ui__lab"
version := "4.0.0-alpha.24-db1c1f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-d9ffbc",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-049a3f",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-75d39a",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-a949a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20190807Z-adef87",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        