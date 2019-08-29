organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-6a3b4f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-82a44b",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-cdcee6",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-43a9b2",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-91af01",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-86e13e",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "svgo" % "1.2-dt-20190722Z-ced410")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        