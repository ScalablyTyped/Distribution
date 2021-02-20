organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20201002Z-3b2f77"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "chokidar" % "3.4.3-bccb7c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-ac41cb",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20201002Z-428938",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20201002Z-43e451",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-57d176",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20201002Z-4d4056",
  "org.scalablytyped" %%% "q" % "1.5-dt-20201002Z-bdbd74",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20200902Z-11d8ec",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20200515Z-cedac8",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-0812a6",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200515Z-e6584e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
