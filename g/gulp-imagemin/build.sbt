organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-e6d696"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-aba896",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-a8387a",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-677b24",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-6e0bd4",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-b6e4f5",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200515Z-164712")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
