organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.11.5-476738"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.14-bad05b",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-660920",
  "org.scalablytyped" %%% "angular__forms" % "8.2.14-09d4bd",
  "org.scalablytyped" %%% "angular__router" % "8.2.14-6b874d",
  "org.scalablytyped" %%% "ionic__core" % "4.11.5-d78639",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-7523bc",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-08a2c3",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        