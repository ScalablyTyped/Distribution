organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.5.0-9a25ff"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20211202Z-fff3da",
  "org.scalablytyped" %%% "formidable" % "2.0-dt-20220502Z-562f67",
  "org.scalablytyped" %%% "inversify" % "6.0.1-f71ce0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "restify" % "8.5-dt-20220810Z-00dd78",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20211202Z-587716",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
