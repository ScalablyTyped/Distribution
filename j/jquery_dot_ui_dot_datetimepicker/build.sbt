organization := "org.scalablytyped"
name := "jquery_dot_ui_dot_datetimepicker"
version := "0.3-dt-20190322Z-a041e5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-e499a9",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20191218Z-244759",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8d2e4e",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        