organization := "org.scalablytyped"
name := "homeworks"
version := "1.0.50-c6a7ea"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__compiler" % "8.2.14-f936ad",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-5e9c54",
  "org.scalablytyped" %%% "angular__forms" % "8.2.14-535ab0",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-9633df",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20191126Z-e499a9",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-81a9cd",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-a24188",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-8d2e4e",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-b35991",
  "org.scalablytyped" %%% "typescript" % "3.7.5-6c2ac7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        