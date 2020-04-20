organization := "org.scalablytyped"
name := "homeworks"
version := "1.0.50-a8d0f3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "9.1.2-cf144c",
  "org.scalablytyped" %%% "angular__core" % "9.1.2-795c54",
  "org.scalablytyped" %%% "angular__forms" % "9.1.2-783952",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20200226Z-8b5ea8",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200415Z-e1b00b",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-62f03a",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-7f568a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-ca8578",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200225Z-9f3b8d",
  "org.scalablytyped" %%% "typescript" % "3.8.3-9c93d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
