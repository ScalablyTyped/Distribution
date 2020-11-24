organization := "org.scalablytyped"
name := "homeworks"
version := "1.0.50-6bbc2e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "11.0.2-106a62",
  "org.scalablytyped" %%% "angular__core" % "11.0.2-4129f1",
  "org.scalablytyped" %%% "angular__forms" % "11.0.2-88c022",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-1df9fb",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-7fbb2b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-8d21ff",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-af84f1",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-12b933",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-aa5679",
  "org.scalablytyped" %%% "typescript" % "4.1.2-5e4275")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
