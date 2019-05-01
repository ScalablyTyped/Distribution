organization := "org.scalablytyped"
name := "html-webpack-template"
version := "6.0-dt-20180306Z-45ed5a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c26764",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-923858",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-38807b",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-2849e4",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-351d72",
  "org.scalablytyped" %%% "source-map" % "0.7.3-6cb46e",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6fe94b",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a6952d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190428Z-0cf455")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        