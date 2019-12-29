organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20190322Z-7fc605"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20190322Z-e7cb8d",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190212Z-41563d",
  "org.scalablytyped" %%% "pdfkit" % "v0.10.0-dt-20191226Z-5a0f60",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        