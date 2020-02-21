organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-242304"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-855eb8",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-b2bfe0",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-ecb4df",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-3154b0",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-1051a6",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-5aa1c5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
