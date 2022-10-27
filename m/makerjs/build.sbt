organization := "org.scalablytyped"
name := "makerjs"
version := "0.17.1-9311d2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "danmarshall__jscad-typings" % "1.0.0-2d8015",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "opentype_dot_js" % "1.3-dt-20220812Z-75cf62",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20221016Z-68c965",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
