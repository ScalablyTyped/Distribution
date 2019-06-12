organization := "org.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20180306Z-89233a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-375ab8",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-0a76b7",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-e8183b",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-f5c502",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-3d98de",
  "org.scalablytyped" %%% "source-map" % "0.7.3-b05be9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f9cdac",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e377d2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-9a1e13")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        