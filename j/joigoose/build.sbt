organization := "com.scalablytyped"
name := "joigoose"
version := "2.0-dt-20180910Z-135c61"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-78f798",
  "com.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-cbdcd6",
  "com.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-a0786c",
  "com.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181129Z-925005",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        