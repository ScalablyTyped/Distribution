organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-d361fa"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-3a2ed0",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-4e6f32",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-fe129a",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-761ff4",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-040870",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20190927Z-95896e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        