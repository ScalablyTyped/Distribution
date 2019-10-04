organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-8444fc"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-c70072",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-54b98b",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-f9f6d1",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-933787",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-2fc667",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-cb81ae")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        