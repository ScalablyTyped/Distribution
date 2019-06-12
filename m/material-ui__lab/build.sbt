organization := "org.scalablytyped"
name := "material-ui__lab"
version := "4.0.0-alpha.15-69a685"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-37cd34",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-fd3678",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-293902",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-d0f05a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-62c565",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190607Z-3063e8",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        