organization := "org.scalablytyped"
name := "jsreport-html-to-xlsx"
version := "2.0-dt-20190311Z-fb3f5c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jsreport-core" % "1.5-dt-20180222Z-12c558",
  "org.scalablytyped" %%% "jsreport-xlsx" % "1.4-dt-20180222Z-1f861e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        