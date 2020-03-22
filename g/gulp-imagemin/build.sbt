organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-d18ef7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-09db4c",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-e4a7da",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-b0191c",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-b72989",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-7323f1",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200226Z-9fc633")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
