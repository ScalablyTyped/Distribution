organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.0.7-7bb0f8"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "9.1.1-8d47db",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.1-6d4d16",
  "org.scalablytyped" %%% "angular__core" % "9.1.1-169ba6",
  "org.scalablytyped" %%% "angular__forms" % "9.1.1-741425",
  "org.scalablytyped" %%% "angular__router" % "9.1.1-99bb0a",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-6429a4",
  "org.scalablytyped" %%% "ionic__core" % "5.0.7-70ab3a",
  "org.scalablytyped" %%% "ionicons" % "5.0.1-463e2c",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-f8c277",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-708450",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-b4f532",
  "org.scalablytyped" %%% "typescript" % "3.8.3-07d300")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
