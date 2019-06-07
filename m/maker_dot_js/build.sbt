organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20190322Z-3d3db4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20190322Z-df0cf7",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190212Z-7202ec",
  "org.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20190322Z-79bf17",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        