organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.5.0-07070b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "11.0.2-9969eb",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-106a62",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-4129f1",
  "org.scalablytyped" %%% "angular__forms" % "11.0.2-88c022",
  "org.scalablytyped" %%% "angular__router" % "11.0.2-6d820d",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-1df9fb",
  "org.scalablytyped" %%% "ionic__core" % "5.5.0-a353ca",
  "org.scalablytyped" %%% "ionicons" % "5.2.3-1f6fe0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-8d21ff",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-af84f1",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "swiper" % "5.4-dt-20201028Z-6376e1",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-aa5679",
  "org.scalablytyped" %%% "typescript" % "4.1.2-5e4275")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
