organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.3-1823c1"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-d2dd63",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-d9ffbc",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190710Z-25bdd3",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-301544",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-b412db",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-076e3c",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20190807Z-1f1ea7",
  "org.scalablytyped" %%% "std" % "3.7.0-dev-0b7356")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        