organization := "org.scalablytyped"
name := "jest-validate"
version := "29.2.2-df3afa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20211223Z-32acec",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20211202Z-242218",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20211202Z-a4bec8",
  "org.scalablytyped" %%% "jest__schemas" % "29.0.0-db208b",
  "org.scalablytyped" %%% "jest__types" % "29.2.1-11b970",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "sinclair__typebox" % "0.24.42-8e6dfd",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "yargs" % "17.0-dt-20220923Z-f31aee",
  "org.scalablytyped" %%% "yargs-parser" % "21.0-dt-20220624Z-7e97d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
