organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-73c9b7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-9808a6",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-186f9d",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-0d7080",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-04f87a",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-4eba85",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-e7db16")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
