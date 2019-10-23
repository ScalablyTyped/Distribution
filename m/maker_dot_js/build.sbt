organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20190322Z-63802e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20190322Z-306785",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190212Z-7ce86e",
  "org.scalablytyped" %%% "pdfkit" % "v0.10.0-dt-20191002Z-62d0a7",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        