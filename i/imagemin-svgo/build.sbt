organization := "org.scalablytyped"
name := "imagemin-svgo"
version := "7.0-dt-20180825Z-fe9e19"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-28e71c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20190605Z-ee3de5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        