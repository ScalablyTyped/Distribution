organization := "org.scalablytyped"
name := "gsheetdb"
version := "1.0-dt-20220421Z-42ca03"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "gaxios" % "5.1.0-a4e290",
  "org.scalablytyped" %%% "google-auth-library" % "8.8.0-57d623",
  "org.scalablytyped" %%% "gtoken" % "6.1.2-64b5f4",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
