organization := "org.scalablytyped"
name := "ionic__angular"
version := "5.0.5-516720"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "9.0.7-728b91",
  "org.scalablytyped" %%% "angular__compiler" % "9.0.7-e4b8ad",
  "org.scalablytyped" %%% "angular__core" % "9.0.7-b3c38e",
  "org.scalablytyped" %%% "angular__forms" % "9.0.7-455628",
  "org.scalablytyped" %%% "angular__router" % "9.0.7-c1d950",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-2264c8",
  "org.scalablytyped" %%% "ionic__core" % "5.0.5-6fdf4c",
  "org.scalablytyped" %%% "ionicons" % "5.0.1-463e2c",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-b9e2d2",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-d90dcd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-02ea5e",
  "org.scalablytyped" %%% "typescript" % "3.8.3-07d300")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
