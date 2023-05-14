organization := "org.scalablytyped"
name := "hawk"
version := "9.0-dt-20221216Z-810d59"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-1ebd5d",
  "org.scalablytyped" %%% "crypto-js" % "4.1-dt-20220818Z-70a5e3",
  "org.scalablytyped" %%% "form-data" % "4.0.0-dd6625",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.1-50c06c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-e7d518",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-1da94b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
