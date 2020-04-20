organization := "org.scalablytyped"
name := "gulp-watch"
version := "v4.1.1-dt-20200226Z-a907aa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200226Z-74ac81",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20200226Z-107c95",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200226Z-23b1d1",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20200225Z-bbc6a1",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20200227Z-8fd70b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
