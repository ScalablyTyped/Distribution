organization := "org.scalablytyped"
name := "jquery_dot_ui_dot_datetimepicker"
version := "0.3-dt-20200515Z-c7d704"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20200621Z-33c88a",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20200515Z-430db3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-775559",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
