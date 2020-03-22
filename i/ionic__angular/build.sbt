organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.0.5-d260fd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "9.0.7-ad9645",
  "org.scalablytyped" %%% "angular__compiler" % "9.0.7-e4b8ad",
  "org.scalablytyped" %%% "angular__core" % "9.0.7-3875a4",
  "org.scalablytyped" %%% "angular__forms" % "9.0.7-f8ae70",
  "org.scalablytyped" %%% "angular__router" % "9.0.7-5bf556",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-00a5a8",
  "org.scalablytyped" %%% "ionic__core" % "5.0.5-f804f0",
  "org.scalablytyped" %%% "ionicons" % "5.0.1-0c69cc",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-02ea5e",
  "org.scalablytyped" %%% "typescript" % "3.8.3-4c59b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
