organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.11.5-d401db"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.14-6e57e6",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-318182",
  "org.scalablytyped" %%% "angular__forms" % "8.2.14-269aab",
  "org.scalablytyped" %%% "angular__router" % "8.2.14-7a9f54",
  "org.scalablytyped" %%% "ionic__core" % "4.11.5-0767bf",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-a2b866",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-6ef903",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        