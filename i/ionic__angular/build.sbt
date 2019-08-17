organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.7.4-8ab290"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.2-934acb",
  "org.scalablytyped" %%% "angular__core" % "8.2.2-1b87e9",
  "org.scalablytyped" %%% "angular__forms" % "8.2.2-df7eb2",
  "org.scalablytyped" %%% "angular__router" % "8.2.2-71dba2",
  "org.scalablytyped" %%% "ionic__core" % "4.7.4-739b48",
  "org.scalablytyped" %%% "ionicons" % "4.6.2-d8faed",
  "org.scalablytyped" %%% "rxjs" % "6.5.2-1ca89d",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        