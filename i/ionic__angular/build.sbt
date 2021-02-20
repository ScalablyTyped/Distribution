organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.5.0-a8417d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "angular__common" % "11.0.2-401fee",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-770d71",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-961ef8",
  "org.scalablytyped" %%% "angular__forms" % "11.0.2-b4d289",
  "org.scalablytyped" %%% "angular__router" % "11.0.2-b2c7aa",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-07117c",
  "org.scalablytyped" %%% "ionic__core" % "5.5.0-a9c04a",
  "org.scalablytyped" %%% "ionicons" % "5.2.3-664cb8",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-09c192",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-1c9095",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "swiper" % "5.4-dt-20201028Z-86c6ef",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-0230cb",
  "org.scalablytyped" %%% "typescript" % "4.1.2-42b18f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
