organization := "org.scalablytyped"
name := "marv-pg-driver"
version := "4.0-dt-20220606Z-2ffd19"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "marv" % "6.0-dt-20220810Z-7bbbc7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-b3dd8d",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-b1f268",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-c1bf54",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
