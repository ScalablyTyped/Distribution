organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-ff74ba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-3e5394",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-b7b02a",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-8f32f4",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-b7db77",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-d7be55",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-7ecd47")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        