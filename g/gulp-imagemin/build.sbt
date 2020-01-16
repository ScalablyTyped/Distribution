organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-fb6550"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-4767cb",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-e985f8",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-438783",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-b94b11",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-af6df3",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-11e3a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        