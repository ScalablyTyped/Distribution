organization := "org.scalablytyped"
name := "jquery_dot_ui_dot_layout"
version := "0.0-unknown-dt-20190322Z-d8d40f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190815Z-cc3e42",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8ec6f6",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        