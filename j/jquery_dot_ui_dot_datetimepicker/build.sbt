organization := "org.scalablytyped"
name := "jquery_dot_ui_dot_datetimepicker"
version := "0.3-dt-20190322Z-58d3b0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-dfa39a",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20190322Z-84ec0a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-fd7d83",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        