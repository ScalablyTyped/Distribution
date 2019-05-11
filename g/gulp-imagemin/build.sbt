organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-703611"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-b99cf2",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-ca8e72",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-083391",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-152920",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-4dc4d9",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-0d52b5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        