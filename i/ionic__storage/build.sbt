organization := "org.scalablytyped"
name := "ionic__storage"
version := "2.3.1-6b0771"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-af8712",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-0a724b",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-0d2080",
  "org.scalablytyped" %%% "localforage" % "1.9.0-ea2b5e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-fc5d55",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-b1ecae",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-ad47f2",
  "org.scalablytyped" %%% "typescript" % "4.1.2-be60b7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
