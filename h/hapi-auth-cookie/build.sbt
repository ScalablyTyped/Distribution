organization := "org.scalablytyped"
name := "hapi-auth-cookie"
version := "10.0-dt-20211223Z-f9baa0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-bca80e",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-499ddc",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-7f9660",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-ea44f0",
  "org.scalablytyped" %%% "joi" % "17.6.3-e7f424",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-01eaa7",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-da5598",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-1cc53d",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-d1868c",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
