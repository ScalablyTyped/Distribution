organization := "org.scalablytyped"
name := "material-ui__lab"
version := "4.0.0-alpha.56-74061b"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20201002Z-ea69bf",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20201028Z-118334",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-28b7d6",
  "org.scalablytyped" %%% "jss" % "10.5.0-2bdc57",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-587f74",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-605f27",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-d7f5b4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
