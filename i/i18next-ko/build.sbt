organization := "org.scalablytyped"
name := "i18next-ko"
version := "3.0-dt-20181017Z-7fd903"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "i18next" % "12.1-dt-20181126Z-a713a5",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190415Z-8b74f6",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        