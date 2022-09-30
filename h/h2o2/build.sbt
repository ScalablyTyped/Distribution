organization := "org.scalablytyped"
name := "h2o2"
version := "8.1-dt-20211202Z-1acf2d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20220913Z-9938a9",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-de42af",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20220819Z-1987f1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-d34071",
  "org.scalablytyped" %%% "joi" % "17.6.2-2be84d",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-452777",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-426026",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-b90bd8",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-e95a27",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
