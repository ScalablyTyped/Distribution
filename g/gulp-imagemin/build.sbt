organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-638872"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-4743b7",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-e676c2",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-fed19c",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-fe0243",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-c89aa6",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-ced410")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        