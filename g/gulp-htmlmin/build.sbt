organization := "org.scalablytyped"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20190322Z-4c1ef9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-6563da",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-5aca39",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-0fc3e5",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        