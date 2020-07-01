organization := "org.scalablytyped"
name := "gulp-protractor"
version := "v1.0.0-dt-20200515Z-deb05b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.4.0-9c38d1",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200604Z-e0f252",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20200515Z-41d784",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20200515Z-a1c9d3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-d64372",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200515Z-767e7a",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200515Z-31949f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200515Z-b6eed2",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200515Z-d8700c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
