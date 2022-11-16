organization := "org.scalablytyped"
name := "hapi-auth-cookie"
version := "10.0-dt-20211223Z-e911d0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-4a7295",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-78a4d5",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20221103Z-aaf14f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-dda049",
  "org.scalablytyped" %%% "joi" % "17.7.0-985b45",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-a6e630",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-5535da",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-75d06f",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-02aaa4",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
