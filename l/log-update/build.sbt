organization := "org.scalablytyped"
name := "log-update"
version := "3.1.0-a5f1c4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-escapes" % "3.0-dt-20190306Z-c443cf",
  "org.scalablytyped" %%% "cli-cursor" % "2.1-dt-20181224Z-77e7d1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-f18588")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        