organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-133655"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-80d700",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-33d417",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-58c412",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-d90664",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-488cf1",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-b1a3a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        