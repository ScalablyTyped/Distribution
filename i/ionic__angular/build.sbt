organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.5.0-e25d46"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__common" % "11.0.2-93ef3f",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-52ef14",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-ff73cb",
  "org.scalablytyped" %%% "angular__forms" % "11.0.2-53821b",
  "org.scalablytyped" %%% "angular__router" % "11.0.2-0b7366",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-2d7140",
  "org.scalablytyped" %%% "ionic__core" % "5.5.0-31b01f",
  "org.scalablytyped" %%% "ionicons" % "5.2.3-318f77",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-e772da",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-e1471b",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "swiper" % "5.4-dt-20201028Z-2ebdf4",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-81a546",
  "org.scalablytyped" %%% "typescript" % "4.1.2-b460a1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
