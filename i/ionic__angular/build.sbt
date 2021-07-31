organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.5.0-e326dd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__common" % "11.0.2-65ab4e",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-8420c1",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-af1341",
  "org.scalablytyped" %%% "angular__forms" % "11.0.2-ea5141",
  "org.scalablytyped" %%% "angular__router" % "11.0.2-86ada8",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-be1eb2",
  "org.scalablytyped" %%% "ionic__core" % "5.5.0-bf3334",
  "org.scalablytyped" %%% "ionicons" % "5.2.3-d2147e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-39dd20",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-8b121f",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "swiper" % "5.4-dt-20201028Z-2993b9",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-b7264d",
  "org.scalablytyped" %%% "typescript" % "4.1.2-8e4009")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
