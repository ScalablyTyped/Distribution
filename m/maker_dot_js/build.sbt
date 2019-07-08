organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20190322Z-e5ddc9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20190322Z-7fa2b3",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190212Z-e3cc16",
  "org.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20190322Z-827aa0",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        