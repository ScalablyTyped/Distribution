organization := "org.scalablytyped"
name := "hapi-auth-basic"
version := "5.0.0-dt-20220818Z-01168a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-bca80e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-499ddc",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-0f4cd4",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-5cbb78",
  "org.scalablytyped" %%% "joi" % "17.6.4-bd3b75",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-01eaa7",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-da5598",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-1cc53d",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-f76009",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
