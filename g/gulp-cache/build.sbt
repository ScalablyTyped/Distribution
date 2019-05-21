organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20190322Z-5e495d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-b8ef22",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-36d503",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-96b3ea",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-b0a159")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        