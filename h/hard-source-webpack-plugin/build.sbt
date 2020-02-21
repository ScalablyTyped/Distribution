organization := "org.scalablytyped"
name := "hard-source-webpack-plugin"
version := "1.0-dt-20190717Z-ce7844"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-562662",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-a63dfc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d8ff1",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-934b96",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ed6d57",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-7b3b5d",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-120b1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
