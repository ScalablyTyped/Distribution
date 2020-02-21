organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.11.10-5101f2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.14-fd437b",
  "org.scalablytyped" %%% "angular__compiler" % "8.2.14-c5a41a",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-534f48",
  "org.scalablytyped" %%% "angular__forms" % "8.2.14-5069f3",
  "org.scalablytyped" %%% "angular__router" % "8.2.14-b96ffb",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-16b5a8",
  "org.scalablytyped" %%% "ionic__core" % "4.11.10-7ba9ad",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-de09e2",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "rxjs" % "6.5.4-9b8c0f",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.4-f03c74",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20200121Z-de6228",
  "org.scalablytyped" %%% "typescript" % "3.7.5-a12244")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
