organization := "org.scalablytyped"
name := "lingui__react"
version := "4.2.1-b93b91"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-466f86",
  "org.scalablytyped" %%% "lingui__core" % "4.2.1-3516a0",
  "org.scalablytyped" %%% "lingui__message-utils" % "4.2.1-6562bf",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-f202b2",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230623Z-cbd5eb",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-53038a",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
