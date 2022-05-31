organization := "org.scalablytyped"
name := "ionic__storage"
version := "2.3.1-afed8f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-52ef14",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-ff73cb",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-2d7140",
  "org.scalablytyped" %%% "localforage" % "1.9.0-4e214b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-e772da",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-e1471b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-81a546",
  "org.scalablytyped" %%% "typescript" % "4.1.2-b460a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
