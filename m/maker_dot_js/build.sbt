organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20190322Z-267039"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20190322Z-0443eb",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190212Z-dbce31",
  "org.scalablytyped" %%% "pdfkit" % "v0.10.0-dt-20191002Z-50226b",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        