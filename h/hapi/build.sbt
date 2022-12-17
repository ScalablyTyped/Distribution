organization := "org.scalablytyped"
name := "hapi"
version := "18.0-dt-20221103Z-38afd1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-3f8625",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-5c2246",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-5d016e",
  "org.scalablytyped" %%% "joi" % "17.7.0-7c28f2",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-064059",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-796661",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-32f50b",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-342deb",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
