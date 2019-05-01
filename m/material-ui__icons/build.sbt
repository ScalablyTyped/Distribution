organization := "org.scalablytyped"
name := "material-ui__icons"
version := "3.0.2-6cc0df"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-908b0a",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-f7bc2e",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-3546cb",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-ceff61",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-998925",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-e0e6aa",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-aae4f0",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190430Z-67de50",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        