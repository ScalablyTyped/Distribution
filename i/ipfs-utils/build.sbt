organization := "org.scalablytyped"
name := "ipfs-utils"
version := "9.0.14-8ed47d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "electron" % "24.3.0-4ef8f4",
  "org.scalablytyped" %%% "electron-fetch" % "1.9.1-7136c8",
  "org.scalablytyped" %%% "ipfs-unixfs" % "11.0.0-cbcdb6",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "protons-runtime" % "5.0.0-2c8611",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "uint8arraylist" % "2.4.3-95c018")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
