organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.5.0-7061c6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__common" % "11.0.2-d0afe2",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-af8712",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-0a724b",
  "org.scalablytyped" %%% "angular__forms" % "11.0.2-3e3674",
  "org.scalablytyped" %%% "angular__router" % "11.0.2-21c2f0",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-0d2080",
  "org.scalablytyped" %%% "ionic__core" % "5.5.0-a63112",
  "org.scalablytyped" %%% "ionicons" % "5.2.3-ff8e81",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-fc5d55",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-b1ecae",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "swiper" % "5.4-dt-20201028Z-cb92c0",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-ad47f2",
  "org.scalablytyped" %%% "typescript" % "4.1.2-be60b7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
