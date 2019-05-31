organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20190322Z-9ba363"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-b0ea66",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-1a563c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-3cc072",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a1762e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        